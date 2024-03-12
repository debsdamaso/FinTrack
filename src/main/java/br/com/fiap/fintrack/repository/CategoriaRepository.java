package br.com.fiap.fintrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.fintrack.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
