package org.spring.repository.test;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by tk on 13.01.17.
 */
public class CdiConfig {
    @Produces
    @Dependent
    @PersistenceContext
    public EntityManager entityManager;
}