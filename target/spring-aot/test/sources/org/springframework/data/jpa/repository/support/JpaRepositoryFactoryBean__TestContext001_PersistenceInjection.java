package org.springframework.data.jpa.repository.support;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.RegisteredBean;
import org.springframework.orm.jpa.EntityManagerFactoryUtils;
import org.springframework.orm.jpa.SharedEntityManagerCreator;

/**
 * Persistence injection for {@link JpaRepositoryFactoryBean}.
 */
public class JpaRepositoryFactoryBean__TestContext001_PersistenceInjection {
  /**
   * Get the 'default' {@link EntityManager}
   */
  public static EntityManager getEntityManager(RegisteredBean registeredBean) {
    EntityManagerFactory entityManagerFactory = EntityManagerFactoryUtils.findEntityManagerFactory((ListableBeanFactory) registeredBean.getBeanFactory(), "");
    return SharedEntityManagerCreator.createSharedEntityManager(entityManagerFactory, null, true);
  }

  /**
   * Apply the persistence injection.
   */
  public static JpaRepositoryFactoryBean apply(RegisteredBean registeredBean,
      JpaRepositoryFactoryBean instance) {
    instance.setEntityManager(getEntityManager(registeredBean));
    return instance;
  }
}
