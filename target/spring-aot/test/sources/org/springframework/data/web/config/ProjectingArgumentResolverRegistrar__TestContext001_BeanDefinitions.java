package org.springframework.data.web.config;

import java.lang.Class;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ProjectingArgumentResolverRegistrar}
 */
public class ProjectingArgumentResolverRegistrar__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'projectingArgumentResolverRegistrar'
   */
  public static BeanDefinition getProjectingArgumentResolverRegistrarBeanDefinition() {
    Class<?> beanType = ProjectingArgumentResolverRegistrar.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ProjectingArgumentResolverRegistrar::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'projectingArgumentResolverBeanPostProcessor'.
   */
  private static BeanInstanceSupplier<ProjectingArgumentResolverRegistrar.ProjectingArgumentResolverBeanPostProcessor> getProjectingArgumentResolverBeanPostProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ProjectingArgumentResolverRegistrar.ProjectingArgumentResolverBeanPostProcessor>forFactoryMethod(ProjectingArgumentResolverRegistrar.class, "projectingArgumentResolverBeanPostProcessor", ObjectFactory.class)
            .withGenerator((registeredBean, args) -> ProjectingArgumentResolverRegistrar.projectingArgumentResolverBeanPostProcessor(args.get(0)));
  }

  /**
   * Get the bean definition for 'projectingArgumentResolverBeanPostProcessor'
   */
  public static BeanDefinition getProjectingArgumentResolverBeanPostProcessorBeanDefinition() {
    Class<?> beanType = ProjectingArgumentResolverRegistrar.ProjectingArgumentResolverBeanPostProcessor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getProjectingArgumentResolverBeanPostProcessorInstanceSupplier());
    return beanDefinition;
  }
}
