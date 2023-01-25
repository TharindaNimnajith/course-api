package org.springframework.data.jpa.repository.support;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.AutowiredMethodArgumentsResolver;
import org.springframework.beans.factory.support.RegisteredBean;
import org.springframework.data.jpa.repository.query.JpaQueryMethodFactory;

/**
 * Autowiring for {@link JpaRepositoryFactoryBean}.
 */
public class JpaRepositoryFactoryBean__TestContext001_Autowiring2 {
  /**
   * Apply the autowiring.
   */
  public static JpaRepositoryFactoryBean apply(RegisteredBean registeredBean,
      JpaRepositoryFactoryBean instance) {
    AutowiredMethodArgumentsResolver.forRequiredMethod("setQueryMethodFactory", JpaQueryMethodFactory.class).resolve(registeredBean, args -> instance.setQueryMethodFactory(args.get(0)));
    AutowiredMethodArgumentsResolver.forRequiredMethod("setEntityPathResolver", ObjectProvider.class).resolve(registeredBean, args -> instance.setEntityPathResolver(args.get(0)));
    return instance;
  }
}
