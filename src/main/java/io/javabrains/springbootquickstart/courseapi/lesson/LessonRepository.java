package io.javabrains.springbootquickstart.courseapi.lesson;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// JpaRepository extends ListCrudRepository, ListPagingAndSortingRepository, QueryByExampleExecutor
// ListCrudRepository extends CrudRepository
// ListPagingAndSortingRepository extends PagingAndSortingRepository
// CrudRepository extends Repository
// PagingAndSortingRepository extends Repository
//
// CrudRepository
// 1. save(entity)
//    - saves a given entity
//    - use the returned instance for further operations as the save operation might have changed the entity instance
//    - params: entity (must not be null)
//    - returns: the saved entity (will never be null)
//
// ListCrudRepository
//
//
// PagingAndSortingRepository
//
//
// ListPagingAndSortingRepository
//
//
// QueryByExampleExecutor
//
//
// JpaRepository
//

public interface LessonRepository extends JpaRepository<Lesson, String> {

    List<Lesson> findByName(String name);

    List<Lesson> findByCourseId(String courseId);

}
