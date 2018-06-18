package com.inc.dairy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.inc.dairy.sevice.DairyService;

@Controller
public class DairyController {
	
	@Autowired
	DairyService dairyService;
	
	
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("dairyList", dairyService.list());
		return "main";
	}
}
