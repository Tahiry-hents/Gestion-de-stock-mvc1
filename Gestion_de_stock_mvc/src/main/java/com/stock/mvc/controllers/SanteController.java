package com.stock.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/sante",method=RequestMethod.GET)
public class SanteController {
	@RequestMapping(value="")
	public String home() {
		return "sante/sante";
	}
	

}