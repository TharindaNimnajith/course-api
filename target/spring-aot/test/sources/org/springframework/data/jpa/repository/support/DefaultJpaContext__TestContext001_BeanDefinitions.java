package org.springframework.data.jpa.repository.support;

import java.lang.Class;
import java.util.Set;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DefaultJpaContext}
 */
public class DefaultJpaContext__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'jpaContext'.
   */
  private static BeanInstanceSupplier<DefaultJpaContext> getJpaContextInstanceSupplier() {
    return BeanInstanceSupplier.<DefaultJpaContext>forConstructor(Set.class)
            .withGenerator((registeredBean, args) -> new DefaultJpaContext(args.get(0)));
  }

  /**
   * Get the bean definition for 'jpaContext'
   */
  public static BeanDefinition getJpaContextBeanDefinition() {
    Class<?> beanType = DefaultJpaContext.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getJpaContextInstanceSupplier());
    return beanDefinition;
  }
}
