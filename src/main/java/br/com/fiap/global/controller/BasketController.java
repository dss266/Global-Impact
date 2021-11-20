package br.com.fiap.global.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.global.model.Basket;
import br.com.fiap.global.model.Item;
import br.com.fiap.global.repository.BasketRepository;
import br.com.fiap.global.repository.ItemRepository;

@Controller
@RequestMapping("/basket")
public class BasketController {

	@Autowired
	private BasketRepository basketRepository;

	@Autowired
	private ItemRepository itemRepository;
	
	@RequestMapping("new")
	public String create(Basket basket) {
		return "basket-form";
	}
	
	@GetMapping("/details/{id}")
	public ModelAndView details(@PathVariable Long id, @Valid Basket basket, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("basket-details");
		modelAndView.addObject("basket", basketRepository.findById(id));
		return modelAndView;
	}
	
	@PostMapping
	public String save(@Valid Basket basket, BindingResult result, RedirectAttributes redirect) {
		basketRepository.save(basket);
		return "redirect:basket";
	}
	
	@RequestMapping
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("baskets");
		List<Basket> baskets = basketRepository.findAll();
		modelAndView.addObject("baskets", baskets);		
		return modelAndView;
	}
	
	
}