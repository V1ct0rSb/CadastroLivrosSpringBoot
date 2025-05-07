package com.victor.barreto.SistemaCadastroLivros.controller;

import com.victor.barreto.SistemaCadastroLivros.model.CategoriaModel;
import com.victor.barreto.SistemaCadastroLivros.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    //Listar
    @GetMapping
    public ResponseEntity<List<CategoriaModel>> findAll() {
        List<CategoriaModel> categoriaModelList = categoriaService.findAll();
        return ResponseEntity.ok().body(categoriaModelList);
    }

    //Inserir
    @PostMapping
    public ResponseEntity<CategoriaModel> insert(@RequestBody CategoriaModel obj){
        obj = categoriaService.insert(obj);
        return ResponseEntity.ok().body(obj);
    }

    //Deletar
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        categoriaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
