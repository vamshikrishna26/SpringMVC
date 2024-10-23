package employeemvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TestEmployee {
	@RequestMapping("/")
	public String getlogin() {
		System.out.println("loginpage");
		return "index";
	}
	
	@ModelAttribute("Company")
	public String getCompany() {
		return "IBM";
	}
	@RequestMapping("addEmployee")
	public String addEmployee1(@ModelAttribute("employee1") Employee e1) {
		return "login";
	}
}
