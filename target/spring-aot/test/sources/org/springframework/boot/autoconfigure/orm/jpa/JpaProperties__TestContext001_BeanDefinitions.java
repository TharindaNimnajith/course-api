package org.springframework.boot.autoconfigure.orm.jpa;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JpaProperties}
 */
public class JpaProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'jpaProperties'
   */
  public static BeanDefinition getJpaPropertiesBeanDefinition() {
    Class<?> beanType = JpaProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(JpaProperties::new);
    return beanDefinition;
  }
}
