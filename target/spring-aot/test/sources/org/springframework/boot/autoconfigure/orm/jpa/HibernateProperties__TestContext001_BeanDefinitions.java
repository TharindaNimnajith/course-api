package org.springframework.boot.autoconfigure.orm.jpa;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HibernateProperties}
 */
public class HibernateProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'hibernateProperties'
   */
  public static BeanDefinition getHibernatePropertiesBeanDefinition() {
    Class<?> beanType = HibernateProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(HibernateProperties::new);
    return beanDefinition;
  }
}
