package com.victor.barreto.SistemaCadastroLivros.service;

import com.victor.barreto.SistemaCadastroLivros.Repository.EditoraRepository;
import com.victor.barreto.SistemaCadastroLivros.model.EditoraModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository editoraRepository;

    //Lista
    public List<EditoraModel> findAll() {
        return editoraRepository.findAll();
    }

    public EditoraModel insert(EditoraModel obj){
        return editoraRepository.save(obj);
    }

    public void delete(Long id){
        editoraRepository.deleteById(id);
    }
}
