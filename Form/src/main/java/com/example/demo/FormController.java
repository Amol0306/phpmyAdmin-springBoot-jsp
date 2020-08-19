package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FormController {
	
	@Autowired
	private FormRepository fr;
	@RequestMapping("/")
	public String detail()
	{System.out.println("1");
		return "amol";
		
	}
	
	@RequestMapping("/details")
	public String details(Form form)
	{System.out.println("2");
		fr.save(form);
		return "amol";
	}
}
