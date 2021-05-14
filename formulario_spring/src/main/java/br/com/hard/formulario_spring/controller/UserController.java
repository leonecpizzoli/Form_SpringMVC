package br.com.hard.formulario_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hard.formulario_spring.model.User;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public String usersForm(final Model model){
		model.addAttribute("user", new User());
		
		return "userForm";
	}
	
	@PostMapping
	public String result(@ModelAttribute User user){
		
		return "result";
	}

}
