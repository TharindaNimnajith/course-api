package org.springframework.data.jpa.repository.support;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EntityManagerBeanDefinitionRegistrarPostProcessor}
 */
public class EntityManagerBeanDefinitionRegistrarPostProcessor__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'emBeanDefinitionRegistrarPostProcessor'
   */
  public static BeanDefinition getEmBeanDefinitionRegistrarPostProcessorBeanDefinition() {
    Class<?> beanType = EntityManagerBeanDefinitionRegistrarPostProcessor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(EntityManagerBeanDefinitionRegistrarPostProcessor::new);
    return beanDefinition;
  }
}
