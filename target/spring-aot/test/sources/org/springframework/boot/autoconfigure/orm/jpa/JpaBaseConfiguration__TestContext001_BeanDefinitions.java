package org.springframework.boot.autoconfigure.orm.jpa;

import java.lang.Class;
import java.lang.String;
import java.util.List;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.persistenceunit.PersistenceManagedTypes;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewInterceptor;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Bean definitions for {@link JpaBaseConfiguration}
 */
public class JpaBaseConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'transactionManager'.
   */
  private static BeanInstanceSupplier<PlatformTransactionManager> getTransactionManagerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PlatformTransactionManager>forFactoryMethod(JpaBaseConfiguration.class, "transactionManager", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JpaBaseConfiguration.class).transactionManager(args.get(0)));
  }

  /**
   * Get the bean definition for 'transactionManager'
   */
  public static BeanDefinition getTransactionManagerBeanDefinition() {
    Class<?> beanType = PlatformTransactionManager.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getTransactionManagerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jpaVendorAdapter'.
   */
  private static BeanInstanceSupplier<JpaVendorAdapter> getJpaVendorAdapterInstanceSupplier() {
    return BeanInstanceSupplier.<JpaVendorAdapter>forFactoryMethod(JpaBaseConfiguration.class, "jpaVendorAdapter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JpaBaseConfiguration.class).jpaVendorAdapter());
  }

  /**
   * Get the bean definition for 'jpaVendorAdapter'
   */
  public static BeanDefinition getJpaVendorAdapterBeanDefinition() {
    Class<?> beanType = JpaVendorAdapter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getJpaVendorAdapterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'entityManagerFactoryBuilder'.
   */
  private static BeanInstanceSupplier<EntityManagerFactoryBuilder> getEntityManagerFactoryBuilderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EntityManagerFactoryBuilder>forFactoryMethod(JpaBaseConfiguration.class, "entityManagerFactoryBuilder", JpaVendorAdapter.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JpaBaseConfiguration.class).entityManagerFactoryBuilder(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'entityManagerFactoryBuilder'
   */
  public static BeanDefinition getEntityManagerFactoryBuilderBeanDefinition() {
    Class<?> beanType = EntityManagerFactoryBuilder.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getEntityManagerFactoryBuilderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'entityManagerFactory'.
   */
  private static BeanInstanceSupplier<LocalContainerEntityManagerFactoryBean> getEntityManagerFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocalContainerEntityManagerFactoryBean>forFactoryMethod(JpaBaseConfiguration.class, "entityManagerFactory", EntityManagerFactoryBuilder.class, PersistenceManagedTypes.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JpaBaseConfiguration.class).entityManagerFactory(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'entityManagerFactory'
   */
  public static BeanDefinition getEntityManagerFactoryBeanDefinition() {
    Class<?> beanType = LocalContainerEntityManagerFactoryBean.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setPrimary(true);
    beanDefinition.setDependsOn("dataSourceScriptDatabaseInitializer");
    beanDefinition.setInstanceSupplier(getEntityManagerFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link JpaBaseConfiguration.JpaWebConfiguration}
   */
  public static class JpaWebConfiguration__BeanDefinitions {
    /**
     * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration$JpaWebConfiguration'.
     */
    private static BeanInstanceSupplier<JpaBaseConfiguration.JpaWebConfiguration> getJpaWebConfigurationInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<JpaBaseConfiguration.JpaWebConfiguration>forConstructor(JpaProperties.class)
              .withGenerator((registeredBean, args) -> new JpaBaseConfiguration.JpaWebConfiguration(args.get(0)));
    }

    /**
     * Get the bean definition for 'jpaWebConfiguration'
     */
    public static BeanDefinition getJpaWebConfigurationBeanDefinition() {
      Class<?> beanType = JpaBaseConfiguration.JpaWebConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getJpaWebConfigurationInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'openEntityManagerInViewInterceptor'.
     */
    private static BeanInstanceSupplier<OpenEntityManagerInViewInterceptor> getOpenEntityManagerInViewInterceptorInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<OpenEntityManagerInViewInterceptor>forFactoryMethod(JpaBaseConfiguration.JpaWebConfiguration.class, "openEntityManagerInViewInterceptor")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JpaBaseConfiguration.JpaWebConfiguration.class).openEntityManagerInViewInterceptor());
    }

    /**
     * Get the bean definition for 'openEntityManagerInViewInterceptor'
     */
    public static BeanDefinition getOpenEntityManagerInViewInterceptorBeanDefinition() {
      Class<?> beanType = OpenEntityManagerInViewInterceptor.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getOpenEntityManagerInViewInterceptorInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'openEntityManagerInViewInterceptorConfigurer'.
     */
    private static BeanInstanceSupplier<WebMvcConfigurer> getOpenEntityManagerInViewInterceptorConfigurerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<WebMvcConfigurer>forFactoryMethod(JpaBaseConfiguration.JpaWebConfiguration.class, "openEntityManagerInViewInterceptorConfigurer", OpenEntityManagerInViewInterceptor.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JpaBaseConfiguration.JpaWebConfiguration.class).openEntityManagerInViewInterceptorConfigurer(args.get(0)));
    }

    /**
     * Get the bean definition for 'openEntityManagerInViewInterceptorConfigurer'
     */
    public static BeanDefinition getOpenEntityManagerInViewInterceptorConfigurerBeanDefinition() {
      Class<?> beanType = WebMvcConfigurer.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getOpenEntityManagerInViewInterceptorConfigurerInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link JpaBaseConfiguration.PersistenceManagedTypesConfiguration}
   */
  public static class PersistenceManagedTypesConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'persistenceManagedTypesConfiguration'
     */
    public static BeanDefinition getPersistenceManagedTypesConfigurationBeanDefinition() {
      Class<?> beanType = JpaBaseConfiguration.PersistenceManagedTypesConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(JpaBaseConfiguration.PersistenceManagedTypesConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance for 'persistenceManagedTypes'.
     */
    private static PersistenceManagedTypes getPersistenceManagedTypesInstance() {
      List<String> managedClassNames = List.of("io.javabrains.springbootquickstart.courseapi.course.Course", "io.javabrains.springbootquickstart.courseapi.lesson.Lesson", "io.javabrains.springbootquickstart.courseapi.newtopic.NewTopic");
      List<String> managedPackages = List.of();
      return PersistenceManagedTypes.of(managedClassNames, managedPackages);
    }

    /**
     * Get the bean definition for 'persistenceManagedTypes'
     */
    public static BeanDefinition getPersistenceManagedTypesBeanDefinition() {
      Class<?> beanType = PersistenceManagedTypes.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setPrimary(true);
      beanDefinition.setInstanceSupplier(PersistenceManagedTypesConfiguration__BeanDefinitions::getPersistenceManagedTypesInstance);
      return beanDefinition;
    }
  }
}
