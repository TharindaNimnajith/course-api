package io.javabrains.springbootquickstart.courseapi.newtopic;

import org.springframework.data.repository.CrudRepository;

public interface NewTopicRepository extends CrudRepository<NewTopic, String> {
    //
}
