package br.com.alura.linguagensapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemController {

//    @Autowired
    private LinguagemRepository respository;

    public LinguagemController(LinguagemRepository respository) {
        this.respository = respository;
    }

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens() {

        List<Linguagem> linguagens = respository.findAll();

        linguagens.forEach(System.out::println);
        return linguagens;
    }
}
