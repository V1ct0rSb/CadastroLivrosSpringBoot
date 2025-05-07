package com.victor.barreto.SistemaCadastroLivros.service;

import com.victor.barreto.SistemaCadastroLivros.Repository.CategoriaRepository;
import com.victor.barreto.SistemaCadastroLivros.model.CategoriaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    //Listar
    public List<CategoriaModel> findAll() {
        return categoriaRepository.findAll();
    }

    //Inserir
    public CategoriaModel insert(CategoriaModel obj){
        return categoriaRepository.save(obj);
    }

    //Deletar
    public void delete(Long id){
        categoriaRepository.deleteById(id);
    }
}
