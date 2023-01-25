package org.springframework.boot.actuate.autoconfigure.web.servlet;

import java.lang.Class;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletRegistrationBean;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Bean definitions for {@link WebMvcEndpointChildContextConfiguration}
 */
public class WebMvcEndpointChildContextConfiguration__ManagementBeanDefinitions {
  /**
   * Get the bean instance supplier for 'handlerExceptionResolver'.
   */
  private static BeanInstanceSupplier<CompositeHandlerExceptionResolver> getHandlerExceptionResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CompositeHandlerExceptionResolver>forFactoryMethod(WebMvcEndpointChildContextConfiguration.class, "compositeHandlerExceptionResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebMvcEndpointChildContextConfiguration.class).compositeHandlerExceptionResolver());
  }

  /**
   * Get the bean definition for 'handlerExceptionResolver'
   */
  public static BeanDefinition getHandlerExceptionResolverBeanDefinition() {
    Class<?> beanType = CompositeHandlerExceptionResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<CompositeHandlerExceptionResolver> instanceSupplier = getHandlerExceptionResolverInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(CompositeHandlerExceptionResolver__ManagementAutowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'webMvcEndpointChildContextConfiguration'
   */
  public static BeanDefinition getWebMvcEndpointChildContextConfigurationBeanDefinition() {
    Class<?> beanType = WebMvcEndpointChildContextConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(WebMvcEndpointChildContextConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'errorEndpoint'.
   */
  private static BeanInstanceSupplier<ManagementErrorEndpoint> getErrorEndpointInstanceSupplier() {
    return BeanInstanceSupplier.<ManagementErrorEndpoint>forFactoryMethod(WebMvcEndpointChildContextConfiguration.class, "errorEndpoint", ErrorAttributes.class, ServerProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebMvcEndpointChildContextConfiguration.class).errorEndpoint(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'errorEndpoint'
   */
  public static BeanDefinition getErrorEndpointBeanDefinition() {
    Class<?> beanType = ManagementErrorEndpoint.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getErrorEndpointInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'managementErrorPageCustomizer'.
   */
  private static BeanInstanceSupplier<WebMvcEndpointChildContextConfiguration.ManagementErrorPageCustomizer> getManagementErrorPageCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<WebMvcEndpointChildContextConfiguration.ManagementErrorPageCustomizer>forFactoryMethod(WebMvcEndpointChildContextConfiguration.class, "managementErrorPageCustomizer", ServerProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebMvcEndpointChildContextConfiguration.class).managementErrorPageCustomizer(args.get(0)));
  }

  /**
   * Get the bean definition for 'managementErrorPageCustomizer'
   */
  public static BeanDefinition getManagementErrorPageCustomizerBeanDefinition() {
    Class<?> beanType = WebMvcEndpointChildContextConfiguration.ManagementErrorPageCustomizer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getManagementErrorPageCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dispatcherServlet'.
   */
  private static BeanInstanceSupplier<DispatcherServlet> getDispatcherServletInstanceSupplier() {
    return BeanInstanceSupplier.<DispatcherServlet>forFactoryMethod(WebMvcEndpointChildContextConfiguration.class, "dispatcherServlet")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebMvcEndpointChildContextConfiguration.class).dispatcherServlet());
  }

  /**
   * Get the bean definition for 'dispatcherServlet'
   */
  public static BeanDefinition getDispatcherServletBeanDefinition() {
    Class<?> beanType = DispatcherServlet.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getDispatcherServletInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dispatcherServletRegistration'.
   */
  private static BeanInstanceSupplier<DispatcherServletRegistrationBean> getDispatcherServletRegistrationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DispatcherServletRegistrationBean>forFactoryMethod(WebMvcEndpointChildContextConfiguration.class, "dispatcherServletRegistrationBean", DispatcherServlet.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebMvcEndpointChildContextConfiguration.class).dispatcherServletRegistrationBean(args.get(0)));
  }

  /**
   * Get the bean definition for 'dispatcherServletRegistration'
   */
  public static BeanDefinition getDispatcherServletRegistrationBeanDefinition() {
    Class<?> beanType = DispatcherServletRegistrationBean.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getDispatcherServletRegistrationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'handlerMapping'.
   */
  private static BeanInstanceSupplier<CompositeHandlerMapping> getHandlerMappingInstanceSupplier() {
    return BeanInstanceSupplier.<CompositeHandlerMapping>forFactoryMethod(WebMvcEndpointChildContextConfiguration.class, "compositeHandlerMapping")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebMvcEndpointChildContextConfiguration.class).compositeHandlerMapping());
  }

  /**
   * Get the bean definition for 'handlerMapping'
   */
  public static BeanDefinition getHandlerMappingBeanDefinition() {
    Class<?> beanType = CompositeHandlerMapping.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<CompositeHandlerMapping> instanceSupplier = getHandlerMappingInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(CompositeHandlerMapping__ManagementAutowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'handlerAdapter'.
   */
  private static BeanInstanceSupplier<CompositeHandlerAdapter> getHandlerAdapterInstanceSupplier() {
    return BeanInstanceSupplier.<CompositeHandlerAdapter>forFactoryMethod(WebMvcEndpointChildContextConfiguration.class, "compositeHandlerAdapter", ListableBeanFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebMvcEndpointChildContextConfiguration.class).compositeHandlerAdapter(args.get(0)));
  }

  /**
   * Get the bean definition for 'handlerAdapter'
   */
  public static BeanDefinition getHandlerAdapterBeanDefinition() {
    Class<?> beanType = CompositeHandlerAdapter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getHandlerAdapterInstanceSupplier());
    return beanDefinition;
  }
}
