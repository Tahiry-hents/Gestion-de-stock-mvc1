package com.stock.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stock.mvc.services.IEmployeurService;


@Controller
@RequestMapping(value="/employeur",method=RequestMethod.GET)
public class EmployeurController {
	@Autowired
	private IEmployeurService employeurService;
	@RequestMapping(value="")
	public String employeur(ModelMap map) {
		map.addAttribute("employeurs",  employeurService.selectAll());
		return "employeur/employeur";

	}
	
}