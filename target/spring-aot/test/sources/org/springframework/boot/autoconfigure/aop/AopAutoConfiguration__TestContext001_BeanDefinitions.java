package org.springframework.boot.autoconfigure.aop;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AopAutoConfiguration}
 */
public class AopAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'aopAutoConfiguration'
   */
  public static BeanDefinition getAopAutoConfigurationBeanDefinition() {
    Class<?> beanType = AopAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(AopAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link AopAutoConfiguration.AspectJAutoProxyingConfiguration}
   */
  public static class AspectJAutoProxyingConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'aspectJAutoProxyingConfiguration'
     */
    public static BeanDefinition getAspectJAutoProxyingConfigurationBeanDefinition() {
      Class<?> beanType = AopAutoConfiguration.AspectJAutoProxyingConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(AopAutoConfiguration.AspectJAutoProxyingConfiguration::new);
      return beanDefinition;
    }

    /**
     * Bean definitions for {@link AopAutoConfiguration.AspectJAutoProxyingConfiguration.CglibAutoProxyConfiguration}
     */
    public static class CglibAutoProxyConfiguration__BeanDefinitions {
      /**
       * Get the bean definition for 'cglibAutoProxyConfiguration'
       */
      public static BeanDefinition getCglibAutoProxyConfigurationBeanDefinition() {
        Class<?> beanType = AopAutoConfiguration.AspectJAutoProxyingConfiguration.CglibAutoProxyConfiguration.class;
        RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
        beanDefinition.setInstanceSupplier(AopAutoConfiguration.AspectJAutoProxyingConfiguration.CglibAutoProxyConfiguration::new);
        return beanDefinition;
      }
    }
  }
}
