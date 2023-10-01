package g58112.webg5.pae.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import g58112.webg5.pae.business.PAE;
import g58112.webg5.pae.model.Course;

@Controller
public class CourseController {

    @GetMapping("/courses")
    public String courses(Model model) {
        model.addAttribute("courses", PAE.getCourses());
        model.addAttribute("course", new Course());
        return "courses";
    }

    @GetMapping("/course/{courseId}/details")
    public String detail(Model model) {
        return "course";
    }

    @PostMapping("/course/create")
    public String create(Course course) {
        PAE.addCourse(course);
        return "home";
    }

}
