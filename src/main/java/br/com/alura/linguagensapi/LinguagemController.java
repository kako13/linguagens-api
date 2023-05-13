package br.com.alura.linguagensapi;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Tag(name = "linguagens")
@RestController
@RequestMapping(path = {"/linguagens"}, produces = {"application/json"})
public class LinguagemController {
    @Autowired
    private LinguagemRepository respository;

    @Operation(summary = "Realiza a consulta das linguagens cadastradas", method = "GET")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Consulta relizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados da requisição inválidos"),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao consultar as linguagens")
    })
    @GetMapping
    public ResponseEntity<List<Linguagem>> listar() {
        List<Linguagem> linguagens = this.respository.findAllByOrderByRanking();
        return ResponseEntity.ok(linguagens);
    }

    @Operation(summary = "Realiza o cadastro de uma linguagem", method = "POST")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Cadastro relizado com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados da requisição inválidos"),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao cadastrar linguagem")
    })
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = {"application/json"})
    public ResponseEntity<Linguagem> adicionar(@RequestBody Linguagem linguagem) {
        return new ResponseEntity(this.respository.save(linguagem), HttpStatus.CREATED);
    }

    @Operation(summary = "Realiza a alteração de uma linguagem cadastrada", method = "PUT")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Alteração relizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados da requisição inválidos"),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar a alteração da linguagem")
    })
    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = {"/{linguagemId}"}, consumes = {"application/json"}, produces = {"application/json"})
    public Linguagem atualizar(@PathVariable String linguagemId, @RequestBody Linguagem linguagem) {
        Linguagem linguagemManaged = (Linguagem)this.respository.findById(linguagemId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        BeanUtils.copyProperties(linguagem, linguagemManaged);
        return (Linguagem)this.respository.save(linguagemManaged);
    }

    @Operation(summary = "Realiza a consulta de uma linguagem cadastradas", method = "GET")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Consulta relizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados da requisição inválidos"),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar a consulta da linguagem")
    })
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = {"/{linguagemId}"}, produces = {"application/json"})
    public Linguagem obterPorId(@PathVariable String linguagemId) {
        return (Linguagem)this.respository.findById(linguagemId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Operation(summary = "Realiza a exclusão de uma linguagem cadastradas", method = "DELETE")
    @ApiResponses({
            @ApiResponse(responseCode = "204", description = "Exclusão relizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados da requisição inválidos"),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar a exclusão da linguagem")
    })
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping({"/{linguagemId}"})
    public void remover(@PathVariable String linguagemId) {
        Linguagem linguagem = (Linguagem)this.respository.findById(linguagemId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        this.respository.delete(linguagem);
    }
}
