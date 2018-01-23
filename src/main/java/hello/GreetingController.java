package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private StudentService sst;

    //private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();

   /* @RequestMapping("/greeting")
    public List<Student> greeting(@RequestParam(value="nami", defaultValue="World") String name) {

        System.out.println("name is: "+name);
    return      sst.findByName(name);
    }

    //@RequestMapping("/greeting")
    public List<Student> findByCourse(@RequestParam(value="course", defaultValue="World") String course) {
        System.out.println("name is: "+course);
        return      sst.findByCourse(course);
    }*/
   @RequestMapping(value="/greeting",params="nami")
   public List<Student> greeting(@RequestParam(value="nami", defaultValue="World") String name) {

       System.out.println("name is: "+name);
       return      sst.findByName(name);
   }

    @RequestMapping(value="/greeting",params="course")
    public List<Student> findByCourse(@RequestParam(value="course", defaultValue="World") String course) {
        System.out.println("name is: "+course);
        return      sst.findByCourse(course);
    }

}