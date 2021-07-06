package com.spring.test.wine.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ModelBase.class)
public abstract class ModelBase_ {

	public static volatile SingularAttribute<ModelBase, Date> createdAt;
	public static volatile SingularAttribute<ModelBase, Long> id;
	public static volatile SingularAttribute<ModelBase, Date> updatedAt;

	public static final String CREATED_AT = "createdAt";
	public static final String ID = "id";
	public static final String UPDATED_AT = "updatedAt";

}

