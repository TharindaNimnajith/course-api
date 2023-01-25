package org.springframework.data.jpa.mapping;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.data.jpa.repository.config.JpaMetamodelMappingContextFactoryBean;

/**
 * Bean definitions for {@link JpaMetamodelMappingContext}
 */
public class JpaMetamodelMappingContext__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'jpaMappingContext'
   */
  public static BeanDefinition getJpaMappingContextBeanDefinition() {
    Class<?> beanType = JpaMetamodelMappingContextFactoryBean.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(JpaMetamodelMappingContextFactoryBean::new);
    return beanDefinition;
  }
}
