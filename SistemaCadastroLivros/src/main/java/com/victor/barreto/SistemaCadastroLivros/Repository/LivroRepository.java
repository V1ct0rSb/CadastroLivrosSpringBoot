package com.victor.barreto.SistemaCadastroLivros.Repository;

import com.victor.barreto.SistemaCadastroLivros.model.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface LivroRepository extends JpaRepository<LivroModel, Long> {

    Optional<LivroModel> findByTitulo(String titulo);

    @Query("SELECT l FROM LivroModel l " +
            "WHERE (:categoriaId IS NULL OR l.categoriaModel.id = :categoriaId) " +
            "AND (:editoraId IS NULL OR l.editoraModel.id = :editoraId) " +
            "AND (:precoMin IS NULL OR l.preco >= :precoMin) " +
            "AND (:precoMax IS NULL OR l.preco <= :precoMax)")
    List<LivroModel> buscarComFiltros(
            @Param("categoriaId") Long categoriaId,
            @Param("editoraId") Long editoraId,
            @Param("precoMin") Double precoMin,
            @Param("precoMax") Double precoMax
    );
}
