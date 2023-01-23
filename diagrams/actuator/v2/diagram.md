classDiagram
direction LR
class courseApiApplication
class courseController
class courseRepository
class node15
class courseService
class helloWorldController
class jpaSharedEM_entityManagerFactory
class lessonController
class lessonRepository
class node2
class lessonService
class newTopicController
class newTopicRepository
class node8
class newTopicService
class topicController
class topicService

courseController ..>  courseService
courseRepository ..>  node15
courseRepository ..>  jpaSharedEM_entityManagerFactory
courseService ..>  courseRepository
lessonController ..>  lessonService
lessonRepository ..>  jpaSharedEM_entityManagerFactory
lessonRepository ..>  node2
lessonService ..>  lessonRepository
newTopicController ..>  newTopicService
newTopicRepository ..>  jpaSharedEM_entityManagerFactory
newTopicRepository ..>  node8
newTopicService ..>  newTopicRepository
topicController ..>  topicService 
