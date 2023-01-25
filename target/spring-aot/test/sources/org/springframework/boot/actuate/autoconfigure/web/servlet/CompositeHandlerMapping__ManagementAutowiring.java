package org.springframework.boot.actuate.autoconfigure.web.servlet;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link CompositeHandlerMapping}.
 */
public class CompositeHandlerMapping__ManagementAutowiring {
  /**
   * Apply the autowiring.
   */
  public static CompositeHandlerMapping apply(RegisteredBean registeredBean,
      CompositeHandlerMapping instance) {
    AutowiredFieldValueResolver.forRequiredField("beanFactory").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
