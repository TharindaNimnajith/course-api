package org.springframework.boot.actuate.autoconfigure.web.servlet;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link CompositeHandlerExceptionResolver}.
 */
public class CompositeHandlerExceptionResolver__ManagementAutowiring {
  /**
   * Apply the autowiring.
   */
  public static CompositeHandlerExceptionResolver apply(RegisteredBean registeredBean,
      CompositeHandlerExceptionResolver instance) {
    AutowiredFieldValueResolver.forRequiredField("beanFactory").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
