package com.spring.test.wine.service;

import com.spring.test.wine.exception.BusinessRulesException;
import com.spring.test.wine.model.WineStore;
import com.spring.test.wine.repository.WineStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class WineStoreService {

    @Autowired
    private WineStoreRepository repository;

    public WineStore getWineStoreByCep(Integer cep) {
        return repository.getWineStoreByCep(cep);
    }

    public WineStore create(WineStore entity) {
        if (!(entity.getStartRange() < entity.getEndRange())) {
            throw new BusinessRulesException("A Faixa Inicial deve ser menor que a Faixa Final");
        }
        WineStore wineStore = getWineStoreByCep(entity.getStartRange());
        if (Objects.nonNull(wineStore)) {
            throw new BusinessRulesException("Já existe uma loja com esse Inicio de Faixa");
        }
        wineStore = getWineStoreByCep(entity.getEndRange());
        if (Objects.nonNull(wineStore)) {
            throw new BusinessRulesException("Já existe uma loja com esse Fim de Faixa");
        }
        return repository.save(entity);
    }

    public WineStore update(Long id, WineStore entity) {
        WineStore stored = repository.findById(id).get();
        WineStore wineStore = getWineStoreByCep(entity.getStartRange());
        if (Objects.nonNull(wineStore) && !wineStore.equals(stored)) {
            throw new BusinessRulesException("Já existe uma loja com esse Inicio de Faixa");
        }
        wineStore = getWineStoreByCep(entity.getEndRange());
        if (Objects.nonNull(wineStore) && !wineStore.equals(stored)) {
            throw new BusinessRulesException("Já existe uma loja com esse Fim de Faixa");
        }
        entity.setId(id);
        return repository.save(entity);
    }
}
