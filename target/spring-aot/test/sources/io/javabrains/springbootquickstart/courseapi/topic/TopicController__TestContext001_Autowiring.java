package io.javabrains.springbootquickstart.courseapi.topic;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TopicController}.
 */
public class TopicController__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TopicController apply(RegisteredBean registeredBean, TopicController instance) {
    AutowiredFieldValueResolver.forRequiredField("topicService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
