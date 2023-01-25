package org.springframework.data.repository.core.support;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.data.repository.config.PropertiesBasedNamedQueriesFactoryBean;

/**
 * Bean definitions for {@link PropertiesBasedNamedQueries}
 */
public class PropertiesBasedNamedQueries__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'named-queries#0'
   */
  public static BeanDefinition getNamedqueriesBeanDefinition() {
    Class<?> beanType = PropertiesBasedNamedQueriesFactoryBean.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.getPropertyValues().addPropertyValue("locations", "classpath*:META-INF/jpa-named-queries.properties");
    beanDefinition.getPropertyValues().addPropertyValue("ignoreResourceNotFound", true);
    beanDefinition.setInstanceSupplier(PropertiesBasedNamedQueriesFactoryBean::new);
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'named-queries#1'
   */
  public static BeanDefinition getNamedqueriesBeanDefinition1() {
    Class<?> beanType = PropertiesBasedNamedQueriesFactoryBean.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.getPropertyValues().addPropertyValue("locations", "classpath*:META-INF/jpa-named-queries.properties");
    beanDefinition.getPropertyValues().addPropertyValue("ignoreResourceNotFound", true);
    beanDefinition.setInstanceSupplier(PropertiesBasedNamedQueriesFactoryBean::new);
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'named-queries#2'
   */
  public static BeanDefinition getNamedqueriesBeanDefinition2() {
    Class<?> beanType = PropertiesBasedNamedQueriesFactoryBean.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.getPropertyValues().addPropertyValue("locations", "classpath*:META-INF/jpa-named-queries.properties");
    beanDefinition.getPropertyValues().addPropertyValue("ignoreResourceNotFound", true);
    beanDefinition.setInstanceSupplier(PropertiesBasedNamedQueriesFactoryBean::new);
    return beanDefinition;
  }
}
