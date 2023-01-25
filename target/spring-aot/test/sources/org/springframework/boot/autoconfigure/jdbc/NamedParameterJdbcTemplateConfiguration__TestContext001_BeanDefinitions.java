package org.springframework.boot.autoconfigure.jdbc;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * Bean definitions for {@link NamedParameterJdbcTemplateConfiguration}
 */
public class NamedParameterJdbcTemplateConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'namedParameterJdbcTemplateConfiguration'
   */
  public static BeanDefinition getNamedParameterJdbcTemplateConfigurationBeanDefinition() {
    Class<?> beanType = NamedParameterJdbcTemplateConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(NamedParameterJdbcTemplateConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'namedParameterJdbcTemplate'.
   */
  private static BeanInstanceSupplier<NamedParameterJdbcTemplate> getNamedParameterJdbcTemplateInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<NamedParameterJdbcTemplate>forFactoryMethod(NamedParameterJdbcTemplateConfiguration.class, "namedParameterJdbcTemplate", JdbcTemplate.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(NamedParameterJdbcTemplateConfiguration.class).namedParameterJdbcTemplate(args.get(0)));
  }

  /**
   * Get the bean definition for 'namedParameterJdbcTemplate'
   */
  public static BeanDefinition getNamedParameterJdbcTemplateBeanDefinition() {
    Class<?> beanType = NamedParameterJdbcTemplate.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setPrimary(true);
    beanDefinition.setDependsOn("dataSourceScriptDatabaseInitializer");
    beanDefinition.setInstanceSupplier(getNamedParameterJdbcTemplateInstanceSupplier());
    return beanDefinition;
  }
}
