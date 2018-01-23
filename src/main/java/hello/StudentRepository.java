package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findByName(@Param("nami") String name);

    List<Student> findAll();

    List<Student> findByCourse(@Param("course") String course);

}