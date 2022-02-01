package com.thbs.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thbs.entity.Customer;
import com.thbs.repository.CustomerRepository;


@Controller
public class CustomerController {
	
	@RequestMapping("/customerLogin")
	public String showLogin()
	{
		
		return "customer_login";
	}

	@RequestMapping("/signup")
	public String showSignUp()
	{
		
		return "customer_signup";
	}

	@Autowired
	CustomerRepository customRepo;
	
	@RequestMapping("/register")
	public String registerUser(@ModelAttribute("customers")Customer cust)
	{
		customRepo.save(cust);
		return "customer_login";
	
	}
	
	@RequestMapping("/auth")
	public String authpage(@ModelAttribute("customers") Customer cust)
    {
		    
            Optional<Customer> searchUser = customRepo.findById(cust.getUsername());            
            if(searchUser.isPresent())
            {
                Customer c1= searchUser.get();
                if(cust.getPassword().equals(c1.getPassword()))
                {
                    System.out.println("success");
                    return "customer";
                }
                return "customer_login";
            }
            else
                return "customer_login";
        }
	
}

