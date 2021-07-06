package com.spring.test.wine.controller;

import com.spring.test.wine.model.WineStore;
import com.spring.test.wine.service.WineStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "wine")
public class WineStoreController extends GenericController<WineStore> {

    @Autowired
    private WineStoreService service;

    @GetMapping("get-wine-store-by-cep")
    public ResponseEntity<WineStore> getWineStoreByCep(@RequestParam(value = "cep") Integer cep) {
        return ResponseEntity.ok().body(service.getWineStoreByCep(cep));
    }

    @PostMapping
    public ResponseEntity<WineStore> create(@Valid @RequestBody WineStore entity) {
        return new ResponseEntity<>(service.create(entity), HttpStatus.CREATED);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<WineStore> update(@PathVariable(value = "id") Long id, @Valid @RequestBody WineStore entity) {
        return ResponseEntity.ok().body(service.update(id, entity));
    }

}
