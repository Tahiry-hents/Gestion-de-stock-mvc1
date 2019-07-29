package com.stock.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stock.mvc.entites.Salarie;
import com.stock.mvc.services.ISalarieService;

@Controller
@RequestMapping(value="/salarie",method=RequestMethod.GET)
public class SalarieController {
	@Autowired
	private ISalarieService salarieService;
	@RequestMapping(value="")
	public String salarie(ModelMap map) {
		map.addAttribute("salaries", salarieService.selectAll());
		return "salarie/salarie";

	}
	@RequestMapping(value="/nouveau",method=RequestMethod.GET)
	public String ajoutersalarie(Model model) {
		Salarie salarie = new Salarie();
		model.addAttribute("salarie", salarie);
		return "salarie/ajouterSalarie";

	}
	
	@RequestMapping(value="/enregistrer",method=RequestMethod.POST)
	public String enregistrerSalarie(Model model,Salarie salarie) {
		if(salarie.getId()!=null) {salarieService.update(salarie);}
		
		else {salarieService.save(salarie);}
			
		return "redirect:/salarie";

	}
	@RequestMapping(value="/modifier/{id}",method=RequestMethod.GET)
	public String modifierSalarie(Model model,@PathVariable Long id) {
		if (id!=null) {
			Salarie salarie= salarieService.getById(id);
			if(salarie !=null)
			{model.addAttribute("salarie", salarie);}
			
		}
		
		
		return "salarie/ajouterSalarie";

	}
	@RequestMapping(value="/supprimer/{id}",method=RequestMethod.GET)
	public String supprimerSalarie(Model model,@PathVariable Long id) {
		if (id!=null) {
			Salarie salarie= salarieService.getById(id);
			if (salarie!=null)
			{
			salarieService.remove(id);
		}
			
		}
		
		
		return "redirect:/salarie";

	}
	
	
	}

	
