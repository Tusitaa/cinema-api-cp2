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
@Table(name = "filmes")
public class Filme {
    @Id
    private Long id;

    @Column(name = "titulo", length = 100, nullable = false)
    private String titulo;

    @Column(name = "genero", length = 100, nullable = false)
    private String genero;

    @Column(name = "duracao_minutos", length = 100, nullable = false)
    private double duracaoMinutos;

    @Column(name = "diretor", length = 100, nullable = true)
    private String diretor;

    
}
