package org.java.spring.controller;

import java.util.List;

import org.java.spring.db.pojo.Discount;
import org.java.spring.db.pojo.Pizza;
import org.java.spring.db.serv.DiscountService;
import org.java.spring.db.serv.PizzaService;
import org.java.spring.dto.PizzaDiscountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@PostMapping("/pizze/discount/create")
	public String storeiscount(@ModelAttribute PizzaDiscountDto pizzaDiscountDto) {
		Pizza pizza = pizzaseService.findById(pizzaDiscountDto.getPizza_id());
		
		Discount discount = new Discount(pizzaDiscountDto.getName(),
							pizzaDiscountDto.getStart_date(),
							pizzaDiscountDto.getEnd_date(),
							pizza
							);
		
		discountService.saveDiscount(discount);
		
		return "redirect:/";
	}

}
