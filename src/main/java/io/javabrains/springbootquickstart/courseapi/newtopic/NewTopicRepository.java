package io.javabrains.springbootquickstart.courseapi.newtopic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewTopicRepository extends CrudRepository<NewTopic, String> {
    //
}
