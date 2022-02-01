package com.thbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thbs.service.JewelleryServiceImpl;

@Controller
public class AppController {
	
	@Autowired
	JewelleryServiceImpl service;
	
	@RequestMapping("/index")
	public String showIndexPage()
	{		
		return "index";		
	}
	@RequestMapping("/forgetPassword")
	public String showForgetPassword()
	{
		return "forget";
	}
	
	@RequestMapping("/gold")
	public String showGoldPage()
	{
		return "customer";
	}
	@RequestMapping("/silver")
	public String showSilverPage()
	{
		return "silver";
	}
	@RequestMapping("/diamond")
	public String showDiamondPage()
	{
		return "diamond";
	}
	@RequestMapping("/platinum")
	public String showPlatinumPage()
	{
		return "platinum";
	}
	@RequestMapping("/about")
	public String showAboutPage()
	{
		return "about";
	}
	@RequestMapping("/purchase")
	public String showSelectedItems(@RequestParam("itemWeight")int weight,@RequestParam("itemPrice")double price,Model model)
	{
		
		model.addAttribute("weight", weight);
		model.addAttribute("price", price);		
		return "purchase";
	}
	@RequestMapping("/payment")
	public String showPayment()
	{
		return "payment";
	}
	
	@RequestMapping("/greeting")
	public String showGreeting()
	{
		return "greeting";
	}
	
	@RequestMapping("/changePassword")
	public void changePassword(Model model)
	{
		
	}
	





	

}
