package springmvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@ModelAttribute("course")
	public String courseName() {
		return "JAVA";
	}
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Welcome Hello");
		return "index";	
	}
	
	@RequestMapping("/springmvc01/addStudent")
	public String addStudent1(@ModelAttribute("student1")Student s1 ) {
		System.out.println("addStudent");
		return "result";
	}
	
	
}
