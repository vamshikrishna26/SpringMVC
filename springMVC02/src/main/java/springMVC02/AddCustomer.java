package springMVC02;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

public class AddCustomer {
	
	@ModelAttribute("Course")
	public String getCourse() {
		return "JAVA";
	}
	
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Welcome Home Page");
		return "index";
	} 
	
	@RequestMapping("/addCustomer")
	public String addCustomer1(@ModelAttribute("Customer1") Customer cust) {
		System.out.println("Add Customer");
		return "result";
	}

}
