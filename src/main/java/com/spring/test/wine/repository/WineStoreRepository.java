package com.spring.test.wine.repository;

import com.spring.test.wine.model.WineStore;
import org.springframework.stereotype.Repository;

@Repository
public interface WineStoreRepository extends GenericRepository<WineStore>, WineStoreRepositoryCustom {

    WineStore getByCode(String code);

}
