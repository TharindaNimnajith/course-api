package org.springframework.boot.autoconfigure.sql.init;

import java.lang.Class;
import javax.sql.DataSource;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataSourceInitializationConfiguration}
 */
public class DataSourceInitializationConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'dataSourceInitializationConfiguration'
   */
  public static BeanDefinition getDataSourceInitializationConfigurationBeanDefinition() {
    Class<?> beanType = DataSourceInitializationConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(DataSourceInitializationConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dataSourceScriptDatabaseInitializer'.
   */
  private static BeanInstanceSupplier<SqlDataSourceScriptDatabaseInitializer> getDataSourceScriptDatabaseInitializerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SqlDataSourceScriptDatabaseInitializer>forFactoryMethod(DataSourceInitializationConfiguration.class, "dataSourceScriptDatabaseInitializer", DataSource.class, SqlInitializationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(DataSourceInitializationConfiguration.class).dataSourceScriptDatabaseInitializer(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'dataSourceScriptDatabaseInitializer'
   */
  public static BeanDefinition getDataSourceScriptDatabaseInitializerBeanDefinition() {
    Class<?> beanType = SqlDataSourceScriptDatabaseInitializer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getDataSourceScriptDatabaseInitializerInstanceSupplier());
    return beanDefinition;
  }
}
