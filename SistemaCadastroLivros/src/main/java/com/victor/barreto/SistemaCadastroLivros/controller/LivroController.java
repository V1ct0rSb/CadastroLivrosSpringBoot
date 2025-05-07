package com.victor.barreto.SistemaCadastroLivros.controller;

import com.victor.barreto.SistemaCadastroLivros.model.LivroModel;
import com.victor.barreto.SistemaCadastroLivros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {
    @Autowired
    private LivroService livroService;

    //Retornar todos os livros cadastrados
    @GetMapping
    public ResponseEntity<List<LivroModel>> findAll() {
        List<LivroModel> list = livroService.findAll();
        return ResponseEntity.ok().body(list);
    }

    //Inserir Livros
    @PostMapping
    public ResponseEntity<LivroModel> insert(@RequestBody LivroModel obj) {
        obj = livroService.insert(obj);
        return ResponseEntity.ok().body(obj);
    }

    //Encontrar Livro pelo Id
    @GetMapping(value = "/{id}")
    public ResponseEntity<LivroModel> findById(@PathVariable Long id) {
        LivroModel obj = livroService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    //Deletar Livro pelo Id
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        livroService.delete(id);
        return ResponseEntity.noContent().build();
    }

    //Atualizar Livro pelo id
    @PutMapping(value = "/{id}")
    public ResponseEntity<LivroModel> update(@PathVariable Long id, @RequestBody LivroModel obj) {
        obj = livroService.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

}
