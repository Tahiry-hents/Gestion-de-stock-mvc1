package com.stock.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stock.mvc.services.IRetraiteService;


@Controller
@RequestMapping(value="/retraite",method=RequestMethod.GET)
public class RetraiteController {
	@Autowired
	private IRetraiteService retraiteService;
	@RequestMapping(value="")
	public String retraite(ModelMap map) {
		map.addAttribute("retraites", retraiteService.selectAll());
		return "retraite/retraite";

	}
	
}
