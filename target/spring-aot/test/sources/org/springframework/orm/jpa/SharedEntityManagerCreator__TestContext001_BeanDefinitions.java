package org.springframework.orm.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SharedEntityManagerCreator}
 */
public class SharedEntityManagerCreator__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'jpaSharedEM_entityManagerFactory'.
   */
  private static BeanInstanceSupplier<EntityManager> getJpaSharedEMentityManagerFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EntityManager>forFactoryMethod(SharedEntityManagerCreator.class, "createSharedEntityManager", EntityManagerFactory.class)
            .withGenerator((registeredBean, args) -> SharedEntityManagerCreator.createSharedEntityManager(args.get(0)));
  }

  /**
   * Get the bean definition for 'jpaSharedEM_entityManagerFactory'
   */
  public static BeanDefinition getJpaSharedEMentityManagerFactoryBeanDefinition() {
    Class<?> beanType = EntityManager.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setAutowireCandidate(false);
    beanDefinition.setRole(BeanDefinition.ROLE_SUPPORT);
    beanDefinition.setSynthetic(true);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("entityManagerFactory"));
    beanDefinition.setInstanceSupplier(getJpaSharedEMentityManagerFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jpaSharedEM_AWC_entityManagerFactory'.
   */
  private static BeanInstanceSupplier<EntityManager> getJpaSharedEMAWCentityManagerFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EntityManager>forFactoryMethod(SharedEntityManagerCreator.class, "createSharedEntityManager", EntityManagerFactory.class)
            .withGenerator((registeredBean, args) -> SharedEntityManagerCreator.createSharedEntityManager(args.get(0)));
  }

  /**
   * Get the bean definition for 'jpaSharedEM_AWC_entityManagerFactory'
   */
  public static BeanDefinition getJpaSharedEMAWCentityManagerFactoryBeanDefinition() {
    Class<?> beanType = EntityManager.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setPrimary(true);
    beanDefinition.setLazyInit(true);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("entityManagerFactory"));
    beanDefinition.setInstanceSupplier(getJpaSharedEMAWCentityManagerFactoryInstanceSupplier());
    return beanDefinition;
  }
}
