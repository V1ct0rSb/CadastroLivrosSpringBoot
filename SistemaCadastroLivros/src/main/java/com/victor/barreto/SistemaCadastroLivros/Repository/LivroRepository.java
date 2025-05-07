package com.victor.barreto.SistemaCadastroLivros.Repository;

import com.victor.barreto.SistemaCadastroLivros.model.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroModel, Long> {
}
