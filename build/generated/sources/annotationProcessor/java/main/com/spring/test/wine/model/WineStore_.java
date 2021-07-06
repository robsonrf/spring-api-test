package com.spring.test.wine.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(WineStore.class)
public abstract class WineStore_ extends com.spring.test.wine.model.ModelBase_ {

	public static volatile SingularAttribute<WineStore, Integer> startRange;
	public static volatile SingularAttribute<WineStore, String> code;
	public static volatile SingularAttribute<WineStore, Integer> endRange;

	public static final String START_RANGE = "startRange";
	public static final String CODE = "code";
	public static final String END_RANGE = "endRange";

}

