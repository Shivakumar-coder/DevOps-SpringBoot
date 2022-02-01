package com.thbs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thbs.entity.Jewels;
import com.thbs.entity.Seller;
import com.thbs.repository.SellerRepository;
import com.thbs.service.JewelleryServiceImpl;


@Controller
public class SellerController {
	
	@Autowired
	JewelleryServiceImpl service;
	
	@RequestMapping("/sellerLogin")
	public String showLogin()
	{
		
		return "seller_login";
	}

	@RequestMapping("/sellerSignup")
	public String showSignUp()
	{
		
		return "seller_signup";
	}

	@Autowired
	SellerRepository sellerRepo;
	
	@RequestMapping("/sellerRegister")
	public String registerUser(@ModelAttribute("sellers")Seller s)
	{
		sellerRepo.save(s);
		return "seller_login";
	
	}
	
	@RequestMapping("/sellerAuthenticate")
	public String authpage(@ModelAttribute("sellers") Seller s,Model model)
    {
		    
            Optional<Seller> searchUser = sellerRepo.findById(s.getUsername());            
            if(searchUser.isPresent())
            {
                Seller c1= searchUser.get();
                if(s.getPassword().equals(c1.getPassword()))
                {
                	List<Jewels> jewelList= service.allJewels();		
            		model.addAttribute("jewelList", jewelList);
                    return "seller";
                }
                return "seller_login";
            }
            else
                return "seller_login";
        }
	
}

