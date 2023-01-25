package org.springframework.boot.autoconfigure.data.web;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SpringDataWebProperties}
 */
public class SpringDataWebProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'springDataWebProperties'
   */
  public static BeanDefinition getSpringDataWebPropertiesBeanDefinition() {
    Class<?> beanType = SpringDataWebProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(SpringDataWebProperties::new);
    return beanDefinition;
  }
}
