package com.victor.barreto.SistemaCadastroLivros.Repository;

import com.victor.barreto.SistemaCadastroLivros.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {

}
