package org.spring.repository.test;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tk on 13.01.17.
 */
@Repository
public interface TestRepository extends CrudRepository<TestEntity, Long> {
    List<TestEntity> findByName(String name);
}