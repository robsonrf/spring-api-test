package com.spring.test.wine.repository;

import com.spring.test.wine.model.ModelBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GenericRepository<T extends ModelBase> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T>{

}