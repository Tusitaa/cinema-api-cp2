package br.com.fiap.cinema.cp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.cinema.cp2.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
