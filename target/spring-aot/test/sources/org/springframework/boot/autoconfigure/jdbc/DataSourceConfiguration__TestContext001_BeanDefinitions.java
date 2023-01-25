package org.springframework.boot.autoconfigure.jdbc;

import com.zaxxer.hikari.HikariDataSource;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataSourceConfiguration}
 */
public class DataSourceConfiguration__TestContext001_BeanDefinitions {
  /**
   * Bean definitions for {@link DataSourceConfiguration.Hikari}
   */
  public static class Hikari__BeanDefinitions {
    /**
     * Get the bean definition for 'hikari'
     */
    public static BeanDefinition getHikariBeanDefinition() {
      Class<?> beanType = DataSourceConfiguration.Hikari.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(DataSourceConfiguration.Hikari::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'dataSource'.
     */
    private static BeanInstanceSupplier<HikariDataSource> getDataSourceInstanceSupplier() {
      return BeanInstanceSupplier.<HikariDataSource>forFactoryMethod(DataSourceConfiguration.Hikari.class, "dataSource", DataSourceProperties.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(DataSourceConfiguration.Hikari.class).dataSource(args.get(0)));
    }

    /**
     * Get the bean definition for 'dataSource'
     */
    public static BeanDefinition getDataSourceBeanDefinition() {
      Class<?> beanType = HikariDataSource.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setDestroyMethodNames("close");
      beanDefinition.setInstanceSupplier(getDataSourceInstanceSupplier());
      return beanDefinition;
    }
  }
}
