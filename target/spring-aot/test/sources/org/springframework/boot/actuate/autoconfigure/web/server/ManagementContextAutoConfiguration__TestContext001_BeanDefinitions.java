package org.springframework.boot.actuate.autoconfigure.web.server;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RegisteredBean;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.autoconfigure.web.ManagementContextFactory;
import org.springframework.context.ApplicationContext;

/**
 * Bean definitions for {@link ManagementContextAutoConfiguration}
 */
public class ManagementContextAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'managementContextAutoConfiguration'
   */
  public static BeanDefinition getManagementContextAutoConfigurationBeanDefinition() {
    Class<?> beanType = ManagementContextAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ManagementContextAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link ManagementContextAutoConfiguration.DifferentManagementContextConfiguration}
   */
  public static class DifferentManagementContextConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'differentManagementContextConfiguration'
     */
    public static BeanDefinition getDifferentManagementContextConfigurationBeanDefinition() {
      Class<?> beanType = ManagementContextAutoConfiguration.DifferentManagementContextConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(ManagementContextAutoConfiguration.DifferentManagementContextConfiguration::new);
      return beanDefinition;
    }

    /**
     * Use AOT management context initialization
     */
    private static ChildManagementContextInitializer childManagementContextInitializerAddManagementInitializer(
        RegisteredBean registeredBean, ChildManagementContextInitializer instance) {
      return instance.withApplicationContextInitializer(new io.javabrains.springbootquickstart.courseapi.CourseApiApplicationTests__ManagementApplicationContextInitializer());
    }

    /**
     * Get the bean instance supplier for 'childManagementContextInitializer'.
     */
    private static BeanInstanceSupplier<ChildManagementContextInitializer> getChildManagementContextInitializerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ChildManagementContextInitializer>forFactoryMethod(ManagementContextAutoConfiguration.DifferentManagementContextConfiguration.class, "childManagementContextInitializer", ManagementContextFactory.class, ApplicationContext.class)
              .withGenerator((registeredBean, args) -> ManagementContextAutoConfiguration.DifferentManagementContextConfiguration.childManagementContextInitializer(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'childManagementContextInitializer'
     */
    public static BeanDefinition getChildManagementContextInitializerBeanDefinition() {
      Class<?> beanType = ChildManagementContextInitializer.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      InstanceSupplier<ChildManagementContextInitializer> instanceSupplier = getChildManagementContextInitializerInstanceSupplier();
      instanceSupplier = instanceSupplier.andThen(DifferentManagementContextConfiguration__BeanDefinitions::childManagementContextInitializerAddManagementInitializer);
      beanDefinition.setInstanceSupplier(instanceSupplier);
      return beanDefinition;
    }
  }
}
