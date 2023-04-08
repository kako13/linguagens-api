package br.com.alura.linguagensapi;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(path = "/linguagens", produces = MediaType.APPLICATION_JSON_VALUE)
public class LinguagemController {

    @Autowired
    private LinguagemRepository respository;


    @GetMapping
    public ResponseEntity<List<Linguagem>> listar() {
        List<Linguagem> linguagens = respository.findAllByOrderByRanking();
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
        Linguagem linguagemManaged = respository.findById(linguagemId)
                                                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
            BeanUtils.copyProperties(linguagem, linguagemManaged);
            return respository.save(linguagemManaged);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{linguagemId}")
    public Linguagem obterPorId(@PathVariable String linguagemId) {
        return respository.findById(linguagemId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{linguagemId}")
    public void remover(@PathVariable String linguagemId) {
        Linguagem linguagem = respository.findById(linguagemId)
                                                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        respository.delete(linguagem);

    }
}
