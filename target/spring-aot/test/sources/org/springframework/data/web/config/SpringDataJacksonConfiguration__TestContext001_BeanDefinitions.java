package org.springframework.data.web.config;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.data.geo.GeoModule;

/**
 * Bean definitions for {@link SpringDataJacksonConfiguration}
 */
public class SpringDataJacksonConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'springDataJacksonConfiguration'
   */
  public static BeanDefinition getSpringDataJacksonConfigurationBeanDefinition() {
    Class<?> beanType = SpringDataJacksonConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(SpringDataJacksonConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jacksonGeoModule'.
   */
  private static BeanInstanceSupplier<GeoModule> getJacksonGeoModuleInstanceSupplier() {
    return BeanInstanceSupplier.<GeoModule>forFactoryMethod(SpringDataJacksonConfiguration.class, "jacksonGeoModule")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(SpringDataJacksonConfiguration.class).jacksonGeoModule());
  }

  /**
   * Get the bean definition for 'jacksonGeoModule'
   */
  public static BeanDefinition getJacksonGeoModuleBeanDefinition() {
    Class<?> beanType = GeoModule.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getJacksonGeoModuleInstanceSupplier());
    return beanDefinition;
  }
}
