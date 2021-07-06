package com.spring.test.wine.repository.impl;

import com.spring.test.wine.model.WineStore;
import com.spring.test.wine.model.WineStore_;
import com.spring.test.wine.repository.WineStoreRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class WineStoreRepositoryImpl implements WineStoreRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public WineStore getWineStoreByCep(Integer cep) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<WineStore> query = cb.createQuery(WineStore.class);
        Root<WineStore> root = query.from( WineStore.class );

        List<Predicate> conditions = new ArrayList<>();

        conditions.add(cb.lessThanOrEqualTo(root.get(WineStore_.START_RANGE), cep));
        conditions.add(cb.greaterThanOrEqualTo(root.get(WineStore_.END_RANGE), cep));

        query.where(conditions.toArray(new Predicate[]{}));
        List<WineStore> resultList = this.em.createQuery(query).getResultList();
        return resultList.size() > 0 ? resultList.get(0) : null;
    }
}
