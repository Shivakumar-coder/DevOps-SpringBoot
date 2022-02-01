package com.thbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thbs.entity.Jewels;
import com.thbs.repository.JewelRepository;
import com.thbs.service.JewelleryServiceImpl;

@Controller
public class JewelController {
	
	@Autowired
	JewelRepository jewelRepo;
	@Autowired
	JewelleryServiceImpl service;
	
//	Showing Seller page
	
	@RequestMapping("/seller")
	public String showSellerHome(Model model)
	{
//		List<Integer> idList = jewelRepo.getJewelId();
//		model.addAttribute("idList", idList);
		List<Jewels> jewelList= service.allJewels();		
		model.addAttribute("jewelList", jewelList);		
		return "seller";
		
	}
//	Adding jewels into database
//	Values taken from seller.html page using POST method 
	@RequestMapping("/addJewel")
	public String addJewel(@ModelAttribute("jewels") Jewels j )
	{		
		jewelRepo.save(j);
		
		return "redirect:/seller";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteJewel(@PathVariable(name = "id") int jewel_id) {
	    service.deleteJewel(jewel_id);
	    return "redirect:/seller";
	    
	     
	}

}
