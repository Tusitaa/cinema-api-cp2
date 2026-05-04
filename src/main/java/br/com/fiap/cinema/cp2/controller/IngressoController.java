package br.com.fiap.cinema.cp2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.cinema.cp2.model.Ingresso;
import br.com.fiap.cinema.cp2.repository.IngressoRepository;

@RestController
@RequestMapping("api/${api.version}/ingressos")
public class IngressoController {

    @Autowired
    private IngressoRepository repository;

    @PostMapping
    public ResponseEntity<Ingresso> create(@RequestBody Ingresso ingresso) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(ingresso));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingresso> findById(@PathVariable Long id) {
        return repository
                .findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Ingresso>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ingresso> update(@PathVariable Long id, @RequestBody Ingresso ingresso) {
        Optional<Ingresso> optIngresso = repository.findById(id);

        if (optIngresso.isPresent()) {
            ingresso.setId(id);
            Ingresso ingressoAlterado = repository.save(ingresso);
            return ResponseEntity.ok(ingressoAlterado);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
