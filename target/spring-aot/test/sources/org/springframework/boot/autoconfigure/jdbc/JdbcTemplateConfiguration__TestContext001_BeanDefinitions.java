package org.springframework.boot.autoconfigure.jdbc;

import java.lang.Class;
import javax.sql.DataSource;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Bean definitions for {@link JdbcTemplateConfiguration}
 */
public class JdbcTemplateConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'jdbcTemplateConfiguration'
   */
  public static BeanDefinition getJdbcTemplateConfigurationBeanDefinition() {
    Class<?> beanType = JdbcTemplateConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(JdbcTemplateConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jdbcTemplate'.
   */
  private static BeanInstanceSupplier<JdbcTemplate> getJdbcTemplateInstanceSupplier() {
    return BeanInstanceSupplier.<JdbcTemplate>forFactoryMethod(JdbcTemplateConfiguration.class, "jdbcTemplate", DataSource.class, JdbcProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JdbcTemplateConfiguration.class).jdbcTemplate(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'jdbcTemplate'
   */
  public static BeanDefinition getJdbcTemplateBeanDefinition() {
    Class<?> beanType = JdbcTemplate.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setPrimary(true);
    beanDefinition.setDependsOn("dataSourceScriptDatabaseInitializer");
    beanDefinition.setInstanceSupplier(getJdbcTemplateInstanceSupplier());
    return beanDefinition;
  }
}
