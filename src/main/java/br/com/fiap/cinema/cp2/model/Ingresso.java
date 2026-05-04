package br.com.fiap.cinema.cp2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ingressos")
public class Ingresso {
    @Id
    private Long id;

    @Column(name = "sessao", length = 100, nullable = false)
    private String sessao;

    @Column(name = "quantidade", length = 100, nullable = false)
    private Integer quantidadeDisponivel;

    @Column(name = "preco", length = 100, nullable = false)
    private Double preco;

    @Column(name = "sala", length = 100, nullable = true)
    private String sala;
}
