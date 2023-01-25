package org.springframework.boot.autoconfigure.transaction;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Bean definitions for {@link TransactionAutoConfiguration}
 */
public class TransactionAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'transactionAutoConfiguration'
   */
  public static BeanDefinition getTransactionAutoConfigurationBeanDefinition() {
    Class<?> beanType = TransactionAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(TransactionAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'platformTransactionManagerCustomizers'.
   */
  private static BeanInstanceSupplier<TransactionManagerCustomizers> getPlatformTransactionManagerCustomizersInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TransactionManagerCustomizers>forFactoryMethod(TransactionAutoConfiguration.class, "platformTransactionManagerCustomizers", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TransactionAutoConfiguration.class).platformTransactionManagerCustomizers(args.get(0)));
  }

  /**
   * Get the bean definition for 'platformTransactionManagerCustomizers'
   */
  public static BeanDefinition getPlatformTransactionManagerCustomizersBeanDefinition() {
    Class<?> beanType = TransactionManagerCustomizers.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getPlatformTransactionManagerCustomizersInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link TransactionAutoConfiguration.EnableTransactionManagementConfiguration}
   */
  public static class EnableTransactionManagementConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'enableTransactionManagementConfiguration'
     */
    public static BeanDefinition getEnableTransactionManagementConfigurationBeanDefinition() {
      Class<?> beanType = TransactionAutoConfiguration.EnableTransactionManagementConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(TransactionAutoConfiguration.EnableTransactionManagementConfiguration::new);
      return beanDefinition;
    }

    /**
     * Bean definitions for {@link TransactionAutoConfiguration.EnableTransactionManagementConfiguration.CglibAutoProxyConfiguration}
     */
    public static class CglibAutoProxyConfiguration__BeanDefinitions {
      /**
       * Get the bean definition for 'cglibAutoProxyConfiguration'
       */
      public static BeanDefinition getCglibAutoProxyConfigurationBeanDefinition() {
        Class<?> beanType = TransactionAutoConfiguration.EnableTransactionManagementConfiguration.CglibAutoProxyConfiguration.class;
        RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
        beanDefinition.setInstanceSupplier(TransactionAutoConfiguration.EnableTransactionManagementConfiguration.CglibAutoProxyConfiguration::new);
        return beanDefinition;
      }
    }
  }

  /**
   * Bean definitions for {@link TransactionAutoConfiguration.TransactionTemplateConfiguration}
   */
  public static class TransactionTemplateConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'transactionTemplateConfiguration'
     */
    public static BeanDefinition getTransactionTemplateConfigurationBeanDefinition() {
      Class<?> beanType = TransactionAutoConfiguration.TransactionTemplateConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(TransactionAutoConfiguration.TransactionTemplateConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'transactionTemplate'.
     */
    private static BeanInstanceSupplier<TransactionTemplate> getTransactionTemplateInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<TransactionTemplate>forFactoryMethod(TransactionAutoConfiguration.TransactionTemplateConfiguration.class, "transactionTemplate", PlatformTransactionManager.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TransactionAutoConfiguration.TransactionTemplateConfiguration.class).transactionTemplate(args.get(0)));
    }

    /**
     * Get the bean definition for 'transactionTemplate'
     */
    public static BeanDefinition getTransactionTemplateBeanDefinition() {
      Class<?> beanType = TransactionTemplate.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getTransactionTemplateInstanceSupplier());
      return beanDefinition;
    }
  }
}
