package com.inc.dairy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.inc.dairy.domain.Dairy;
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
	@GetMapping("/dairy/add")
	public String add(Model model) {
		model.addAttribute("dairy", new Dairy());
		return "dairy/add";
	}
	
	@PostMapping("/dairy/add")
	public String add(@ModelAttribute @Valid Dairy dairy, BindingResult result,
						Model model) {
		if(result.hasErrors()) {
			return "dairy/add";
		}
		dairyService.add(dairy);
		return "redirect:/";
	}
	
}
