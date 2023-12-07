package org.java.spring.controller;

import java.util.List;

import org.java.spring.db.pojo.Pizza;
import org.java.spring.db.serv.DiscountService;
import org.java.spring.db.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DiscountController {
	
	@Autowired
	private PizzaService pizzaseService;
	
	@Autowired
	private DiscountService discountService;
	
	@GetMapping("/pizze/discount/create")
	public String getDiscountForm(Model model) {
		List<Pizza> pizze = pizzaseService.findAll();
		model.addAttribute("pizze", pizze);
		return "discount-form";
	}

}
