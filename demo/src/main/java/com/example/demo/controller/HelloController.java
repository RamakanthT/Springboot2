package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Student;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/hello")
	public String sayHello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String student1(ModelMap model) {
		/*Student s1 = new Student();
		List<String> sArr = new ArrayList<String>();
		sArr.add("c");
		sArr.add("d");
		s1.setAge(11);
		s1.setId(11);
		s1.setName(sArr);*/
		//model.addAttribute("SpringWeb", s1);	
		//model.addAttribute("myStu", new Student());	
		return "Student";
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String student2(Student student, ModelMap model) {
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());

		return "StuResult";
	}
}
