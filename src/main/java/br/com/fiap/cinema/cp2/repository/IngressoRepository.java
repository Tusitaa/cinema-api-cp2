package br.com.fiap.cinema.cp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.cinema.cp2.model.Ingresso;

@Repository
public interface IngressoRepository extends JpaRepository<Ingresso, Long> {
}
