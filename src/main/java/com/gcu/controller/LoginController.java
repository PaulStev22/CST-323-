package com.gcu.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.OrdersBusinessInterface;
import com.gcu.business.SecurityBusinessService;
import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private OrdersBusinessInterface service;
	@Autowired
	private SecurityBusinessService security;
	
    @GetMapping("/")
    public String display(Model model) {
        model.addAttribute("title", "Login Form");
        model.addAttribute("loginModel", new LoginModel());
        return "login";
    }
    
    @PostMapping("/doLogin")
    public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
        
    	service.test();
    	security.authenticate(null, null);
    	
    	
    	if (bindingResult.hasErrors()) {
            return "login";
        }
        
    	List<OrderModel> orders = service.getOrders();
    	
    	
    	orders.addAll(service.getOrders());
    	
    	
    	model.addAttribute("title","MY Orders");
        model.addAttribute("orders", orders);
        
        
        return "orders";
    }
}
    
    

