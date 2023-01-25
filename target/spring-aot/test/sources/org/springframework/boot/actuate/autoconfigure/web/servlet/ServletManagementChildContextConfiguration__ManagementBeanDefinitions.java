package org.springframework.boot.actuate.autoconfigure.web.servlet;

import java.lang.Class;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ServletManagementChildContextConfiguration}
 */
public class ServletManagementChildContextConfiguration__ManagementBeanDefinitions {
  /**
   * Get the bean definition for 'servletManagementChildContextConfiguration'
   */
  public static BeanDefinition getServletManagementChildContextConfigurationBeanDefinition() {
    Class<?> beanType = ServletManagementChildContextConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ServletManagementChildContextConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'servletManagementWebServerFactoryCustomizer'.
   */
  private static BeanInstanceSupplier<ServletManagementChildContextConfiguration.ServletManagementWebServerFactoryCustomizer> getServletManagementWebServerFactoryCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ServletManagementChildContextConfiguration.ServletManagementWebServerFactoryCustomizer>forFactoryMethod(ServletManagementChildContextConfiguration.class, "servletManagementWebServerFactoryCustomizer", ListableBeanFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ServletManagementChildContextConfiguration.class).servletManagementWebServerFactoryCustomizer(args.get(0)));
  }

  /**
   * Get the bean definition for 'servletManagementWebServerFactoryCustomizer'
   */
  public static BeanDefinition getServletManagementWebServerFactoryCustomizerBeanDefinition() {
    Class<?> beanType = ServletManagementChildContextConfiguration.ServletManagementWebServerFactoryCustomizer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getServletManagementWebServerFactoryCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'tomcatManagementAccessLogCustomizer'.
   */
  private static BeanInstanceSupplier<ServletManagementChildContextConfiguration.TomcatAccessLogCustomizer> getTomcatManagementAccessLogCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ServletManagementChildContextConfiguration.TomcatAccessLogCustomizer>forFactoryMethod(ServletManagementChildContextConfiguration.class, "tomcatManagementAccessLogCustomizer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ServletManagementChildContextConfiguration.class).tomcatManagementAccessLogCustomizer());
  }

  /**
   * Get the bean definition for 'tomcatManagementAccessLogCustomizer'
   */
  public static BeanDefinition getTomcatManagementAccessLogCustomizerBeanDefinition() {
    Class<?> beanType = ServletManagementChildContextConfiguration.TomcatAccessLogCustomizer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getTomcatManagementAccessLogCustomizerInstanceSupplier());
    return beanDefinition;
  }
}
