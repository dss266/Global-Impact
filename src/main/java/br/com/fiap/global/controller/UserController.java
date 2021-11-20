package br.com.fiap.global.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.global.model.Address;
import br.com.fiap.global.model.User;
import br.com.fiap.global.repository.UserRepository;



@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private MessageSource messages;
	
	@Autowired
	private UserRepository userRepository;
	
	private String teste;
	
	
	@GetMapping
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("users");
		List<User> users = userRepository.findAll();
		modelAndView.addObject("users", users);
		System.out.println(users);
		return modelAndView;
	}
	
	@RequestMapping("new")
	public String create(User user, Address address) {
		Address userAdress = new Address();
		userAdress.setUser(user);
		return "user-form";
	}
	
	@PostMapping
	public String save(@Valid User user, BindingResult result) {
		if(result.hasErrors()) {
			return "user-form";
		}
		userRepository.save(user);
		System.out.println(user);
		return "login";
	}
	
	@RequestMapping("edit/{id}")
	public ModelAndView edit(@PathVariable ("id") Long id) {
		ModelAndView modelAndView = new ModelAndView("user-edit");
		modelAndView.addObject("user", userRepository.findById(id));
		return modelAndView;
	}
	@PostMapping("/update/{id}")
	public String update(@PathVariable Long id, @Valid User user, BindingResult result, RedirectAttributes redirect) {
			
		  Optional <User> optional = userRepository.findById(id);
		  User newUser = optional.get();
		  newUser.setName(user.getName());
		  newUser.setEmail(user.getEmail());
		  newUser.setCnpj(user.getCnpj());
		  newUser.setPhone(user.getPhone());
		  
		  newUser.getAddress().setStreet(user.getAddress().getStreet());
		  newUser.getAddress().setNumber(user.getAddress().getNumber());
		  newUser.getAddress().setDistrict(user.getAddress().getDistrict());
		  newUser.getAddress().setCity(user.getAddress().getCity());
		  newUser.getAddress().setState(user.getAddress().getState());
		  
		  userRepository.save(user);
		  
		  return "redirect:/home";  
	}
	
	

}