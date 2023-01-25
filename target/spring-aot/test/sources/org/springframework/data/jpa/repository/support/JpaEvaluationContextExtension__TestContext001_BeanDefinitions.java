package org.springframework.data.jpa.repository.support;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JpaEvaluationContextExtension}
 */
public class JpaEvaluationContextExtension__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.data.jpa.repository.support.JpaEvaluationContextExtension'.
   */
  private static BeanInstanceSupplier<JpaEvaluationContextExtension> getJpaEvaluationContextExtensionInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JpaEvaluationContextExtension>forConstructor(char.class)
            .withGenerator((registeredBean, args) -> new JpaEvaluationContextExtension(args.get(0)));
  }

  /**
   * Get the bean definition for 'jpaEvaluationContextExtension'
   */
  public static BeanDefinition getJpaEvaluationContextExtensionBeanDefinition() {
    Class<?> beanType = JpaEvaluationContextExtension.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, '\\');
    beanDefinition.setInstanceSupplier(getJpaEvaluationContextExtensionInstanceSupplier());
    return beanDefinition;
  }
}
