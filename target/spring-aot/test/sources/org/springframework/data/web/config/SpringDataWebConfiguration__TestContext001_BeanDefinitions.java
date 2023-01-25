package org.springframework.data.web.config;

import java.lang.Class;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.SortHandlerMethodArgumentResolver;

/**
 * Bean definitions for {@link SpringDataWebConfiguration}
 */
public class SpringDataWebConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.data.web.config.SpringDataWebConfiguration'.
   */
  private static BeanInstanceSupplier<SpringDataWebConfiguration> getSpringDataWebConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SpringDataWebConfiguration>forConstructor(ApplicationContext.class, ObjectFactory.class)
            .withGenerator((registeredBean, args) -> new SpringDataWebConfiguration(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'springDataWebConfiguration'
   */
  public static BeanDefinition getSpringDataWebConfigurationBeanDefinition() {
    Class<?> beanType = SpringDataWebConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getSpringDataWebConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'pageableResolver'.
   */
  private static BeanInstanceSupplier<PageableHandlerMethodArgumentResolver> getPageableResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PageableHandlerMethodArgumentResolver>forFactoryMethod(SpringDataWebConfiguration.class, "pageableResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(SpringDataWebConfiguration.class).pageableResolver());
  }

  /**
   * Get the bean definition for 'pageableResolver'
   */
  public static BeanDefinition getPageableResolverBeanDefinition() {
    Class<?> beanType = PageableHandlerMethodArgumentResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getPageableResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'sortResolver'.
   */
  private static BeanInstanceSupplier<SortHandlerMethodArgumentResolver> getSortResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SortHandlerMethodArgumentResolver>forFactoryMethod(SpringDataWebConfiguration.class, "sortResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(SpringDataWebConfiguration.class).sortResolver());
  }

  /**
   * Get the bean definition for 'sortResolver'
   */
  public static BeanDefinition getSortResolverBeanDefinition() {
    Class<?> beanType = SortHandlerMethodArgumentResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getSortResolverInstanceSupplier());
    return beanDefinition;
  }
}
