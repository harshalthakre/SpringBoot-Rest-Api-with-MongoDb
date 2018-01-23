package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    private final StudentRepository repository;

    @Autowired
    StudentService(StudentRepository repository){
        this.repository=repository;
    }

    public List<Student> findAll(){
        List<Student> studs=repository.findAll();
        return studs;
    }

    public List<Student> findByName(String name){
        return repository.findByName(name);
    }

    public List<Student> findByCourse(String course){
        return repository.findByCourse(course);
    }

}
