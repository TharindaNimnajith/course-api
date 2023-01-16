package io.javabrains.springbootquickstart.courseapi.newtopic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// JpaRepository extends PagingAndSortingRepository which in turn extends CrudRepository
// CrudRepository mainly provides CRUD functions
// PagingAndSortingRepository provides methods to do pagination and sorting records
// JpaRepository provides JPA-related methods like flushing the persistence context and deleting records in a batch
// Due to the inheritance, JpaRepository has all the functions of CrudRepository and PagingAndSortingRepository
// If the repository does not need functions provided by JpaRepository & PagingAndSortingRepository, use CrudRepository

@Repository
public interface NewTopicRepository extends CrudRepository<NewTopic, String> {
    //
}
