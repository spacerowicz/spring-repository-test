package org.spring.repository.test;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

/**
 * Created by tk on 13.01.17.
 */
@Stateless
public class TestEJB {
    @Inject
    private TestRepository testRepository;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void testRepository() {
        TestEntity testEntity = new TestEntity();
        testEntity.setName("Some name");
        this.testRepository.save(testEntity);
    }
}