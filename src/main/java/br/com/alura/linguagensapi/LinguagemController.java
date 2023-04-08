package br.com.alura.linguagensapi;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/linguagens", produces = MediaType.APPLICATION_JSON_VALUE)
public class LinguagemController {

    @Autowired
    private LinguagemRepository respository;


    @GetMapping
    public ResponseEntity<List<Linguagem>> listar() {
        List<Linguagem> linguagens = respository.findAll();
        linguagens.sort(Comparator.comparingInt(Linguagem::getRanking));
        return ResponseEntity.ok(linguagens);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Linguagem adicionar(@RequestBody Linguagem linguagem) {
        return respository.save(linguagem);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{linguagemId}")
    public Linguagem atualizar(@PathVariable String linguagemId, @RequestBody Linguagem linguagem) {

        Optional<Linguagem> optional = respository.findById(linguagemId);
        if (optional.isPresent()) {
            Linguagem linguagemManaged = optional.get();
            BeanUtils.copyProperties(linguagem, linguagemManaged);
            return respository.save(linguagemManaged);
        }
        return null;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{linguagemId}")
    public Linguagem buscar(@PathVariable String linguagemId) {
        return respository.findById(linguagemId).orElse(null);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{linguagemId}")
    public void remover(@PathVariable String linguagemId) {
        Optional<Linguagem> optional = respository.findById(linguagemId);
        optional.ifPresent(linguagem -> respository.delete(linguagem));

    }
}
