package com.spring.test.wine.repository;

import com.spring.test.wine.model.WineStore;

public interface WineStoreRepositoryCustom {

    WineStore getWineStoreByCep(Integer cep);

}
