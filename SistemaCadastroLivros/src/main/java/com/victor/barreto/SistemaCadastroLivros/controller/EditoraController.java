package com.victor.barreto.SistemaCadastroLivros.controller;

import com.victor.barreto.SistemaCadastroLivros.model.EditoraModel;
import com.victor.barreto.SistemaCadastroLivros.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/editoras")
public class EditoraController {

    @Autowired
    private EditoraService editoraService;

    //Listar
    @GetMapping
    public ResponseEntity<List<EditoraModel>> findAll() {
        List<EditoraModel> editoraModelList = editoraService.findAll();
        return ResponseEntity.ok().body(editoraModelList);
    }

    //Inserir
    @PostMapping
    public ResponseEntity<EditoraModel> insert(@RequestBody EditoraModel obj){
        obj = editoraService.insert(obj);
        return ResponseEntity.ok().body(obj);
    }

    //Deletar
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        editoraService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
