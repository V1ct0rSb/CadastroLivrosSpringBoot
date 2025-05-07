package com.victor.barreto.SistemaCadastroLivros.service;

import com.victor.barreto.SistemaCadastroLivros.Repository.LivroRepository;
import com.victor.barreto.SistemaCadastroLivros.model.LivroModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    //Listar todos os livros
    public List<LivroModel> findAll() {
        return livroRepository.findAll();
    }

    //Inserir Livro
    public LivroModel insert(LivroModel obj) {
        return livroRepository.save(obj);
    }

    //Encontrar pelo Id
    public LivroModel findById(Long id) {
        Optional<LivroModel> obj = livroRepository.findById(id);
        return obj.get();
    }

    //Deletar pelo Id
    public void delete(Long id) {
        livroRepository.deleteById(id);
    }

    //Atualizar Livro pelo id
    public LivroModel update(Long id, LivroModel obj) {
        LivroModel entity = livroRepository.getReferenceById(id);
        updateData(entity, obj);
        return livroRepository.save(entity);
    }

    private void updateData(LivroModel entity, LivroModel obj) {
        entity.setAutor(obj.getAutor());
        entity.setTitulo(obj.getTitulo());
        entity.setAnoPublicacao(obj.getAnoPublicacao());
        entity.setPreco(obj.getPreco());
    }
}
