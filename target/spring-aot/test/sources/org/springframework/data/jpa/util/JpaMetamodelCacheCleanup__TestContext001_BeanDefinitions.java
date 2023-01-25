package org.springframework.data.jpa.util;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JpaMetamodelCacheCleanup}
 */
public class JpaMetamodelCacheCleanup__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'jpaMetamodelCacheCleanup'
   */
  public static BeanDefinition getJpaMetamodelCacheCleanupBeanDefinition() {
    Class<?> beanType = JpaMetamodelCacheCleanup.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(JpaMetamodelCacheCleanup::new);
    return beanDefinition;
  }
}
