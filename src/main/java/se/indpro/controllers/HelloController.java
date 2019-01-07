package se.indpro.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import se.indpro.models.HelloMessage;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello",method= RequestMethod.GET)
	public String helloForm() {
		return "helloform";
	}
	
	@RequestMapping(value="/hello", method= RequestMethod.POST)
	public String hello(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		
		if(name == null || name == "") {
			name = "World";
		}
		
		model.addAttribute("name", name);
		
		return "hello";
	}
}
