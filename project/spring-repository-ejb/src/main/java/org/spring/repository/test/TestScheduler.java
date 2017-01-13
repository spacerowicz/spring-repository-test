package org.spring.repository.test;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Created by tk on 13.01.17.
 */
@Startup
@Singleton
public class TestScheduler {
    @EJB
    private TestEJB testEJB;

    @Schedule(hour = "*", minute = "*", second = "*/5", persistent = false)
    public void executeTestRepository() {
        this.testEJB.testRepository();
    }
}