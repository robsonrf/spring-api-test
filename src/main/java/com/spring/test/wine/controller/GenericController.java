package com.spring.test.wine.controller;

import com.spring.test.wine.model.ModelBase;
import com.spring.test.wine.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * Controller Generico com implementação para os métodos http padrão.
 * @param <T> Entity
 */
public class GenericController<T extends ModelBase> {

    @Autowired
    protected GenericRepository<T> genericRepository;


    @GetMapping(value = "{id}")
    public ResponseEntity<T> get(@PathVariable(value = "id") Long id) {
        return genericRepository.findById(id)
                .map(entity -> ResponseEntity.ok().body(entity))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<T> create(@Valid @RequestBody T entity) {
        return new ResponseEntity<>(genericRepository.save(entity), HttpStatus.CREATED);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<T> update(@PathVariable(value = "id") Long id, @Valid @RequestBody T entity) {
        return genericRepository.findById(id)
                .map(record -> {
                    entity.setId(record.getId());
                    return ResponseEntity.ok().body(genericRepository.save(entity));
                    })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        return genericRepository.findById(id)
                .map(record -> {
                    genericRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                    })
                .orElse(ResponseEntity.notFound().build());
    }

}
