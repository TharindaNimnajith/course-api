package io.javabrains.springbootquickstart.courseapi.lesson;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// JpaRepository extends ListCrudRepository, ListPagingAndSortingRepository, QueryByExampleExecutor
// ListCrudRepository extends CrudRepository
// ListPagingAndSortingRepository extends PagingAndSortingRepository
// CrudRepository extends Repository
// PagingAndSortingRepository extends Repository
//
//
// CrudRepository
//
// 01. <S extends T> S save(S entity)
//     - saves a given entity
//     - use the returned instance for further operations as the save operation might have changed the entity instance
//     - params: entity (must not be null)
//     - returns: the saved entity (will never be null)
//
// 02. <S extends T> Iterable<S> saveAll(Iterable<S> entities)
//     - saves all given entities
//     - params: entities (must not be null nor must it contain null)
//     - returns: the saved entities (will never be null and will be the same size as the Iterable passed as params)
//
// 03. Optional<T> findById(ID id)
//     - retrieves an entity by its id
//     - params: id (must not be null)
//     - returns: the entity with the given id or Optional#empty() if none found
//
// 04. boolean existsById(ID id)
//     - returns whether an entity with the given id exists
//     - params: id (must not be null)
//     - returns: true if an entity with the given id exists, false otherwise
//
// 05. Iterable<T> findAll()
//     - returns all instances of the type
//     - returns: all entities
//
// 06. Iterable<T> findAllById(Iterable<ID> ids)
//     - returns all instances of the type T with the given ids
//     - if some or all ids are not found, no entities are returned for these ids
//     - note that the order of elements in the result is not guaranteed
//     - params: ids (must not be null nor contain any null values)
//     - returns: entities with the given ids (guaranteed to be not null, the size <= the number of given ids)
//
// 07. long count()
//     - returns the number of entities available
//     - returns: the number of entities
//
// 08. void deleteById(ID id)
//     - deletes the entity with the given id
//     - if the entity is not found in the persistence store it is silently ignored
//     - params: id (must not be null)
//
// 09. void delete(T entity)
//     -
//
// 10. void deleteAllById(Iterable<? extends ID> ids)
//     -
//
// 11. void deleteAll(Iterable<? extends T> entities)
//     -
//
// 12. void deleteAll()
//     -
//
//
// ListCrudRepository
//
// 01. <S extends T> List<S> saveAll(Iterable<S> entities)
//     -
//
// 02. List<T> findAll()
//     -
//
// 03. List<T> findAllById(Iterable<ID> ids)
//     -
//
//
// PagingAndSortingRepository
//
// 01. Iterable<T> findAll(Sort sort)
//     -
//
// 01. Page<T> findAll(Pageable pageable)
//     -
//
//
// ListPagingAndSortingRepository
//
// 01. List<T> findAll(Sort sort)
//     -
//
//
// QueryByExampleExecutor
//
// 01.
//     -
//
//
// JpaRepository
//
// 01.
//     -

public interface LessonRepository extends JpaRepository<Lesson, String> {

    List<Lesson> findByName(String name);

    List<Lesson> findByCourseId(String courseId);

}
