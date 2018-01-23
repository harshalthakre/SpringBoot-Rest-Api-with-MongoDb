package hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/mystu")
public class StudentController {

    @Autowired
    private StudentService sst;
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method= RequestMethod.GET)
    public List<Student> getAllStudents(){
        return sst.findAll();
    }

    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    public List<Student> getStudents(@PathVariable("id") String name){
        return sst.findByName(name);
    }

    @RequestMapping(value="courses/{course}",method=RequestMethod.GET)
    public List<Student> getStudentByCourse(@PathVariable("course") String course){
        return sst.findByCourse(course);
    }
}
