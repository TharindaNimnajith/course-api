package org.springframework.boot.actuate.autoconfigure.web.server;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EnableChildManagementContextConfiguration}
 */
public class EnableChildManagementContextConfiguration__ManagementBeanDefinitions {
  /**
   * Get the bean definition for 'enableChildManagementContextConfiguration'
   */
  public static BeanDefinition getEnableChildManagementContextConfigurationBeanDefinition() {
    Class<?> beanType = EnableChildManagementContextConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(EnableChildManagementContextConfiguration::new);
    return beanDefinition;
  }
}
