package com.thbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thbs.entity.Jewels;
import com.thbs.repository.JewelRepository;
import com.thbs.service.JewelleryServiceImpl;

@Controller
public class DisplayController {
	@Autowired
	JewelRepository jewelRepo;
	@Autowired
	JewelleryServiceImpl service;
	
	@RequestMapping("/showAll")
	public String showItems(Model model)
	{
		List<Jewels> jewelList= service.allJewels();		
		model.addAttribute("jewelList", jewelList);		
		return "showItems";
	}

	@RequestMapping("/silverRing")
	public String showSilverRing(Model model)
	{
		List<Jewels> jewelList= jewelRepo.findJewel("silver","ring");		
		model.addAttribute("jewelList", jewelList);		
		return "showItems";
	}
	
	@RequestMapping("/silverChain")
	public String showSilverChain(Model model)
	{
		List<Jewels> jewelList= jewelRepo.findJewel("silver","necklace");		
		model.addAttribute("jewelList", jewelList);		
		return "showItems";
	}
	
//	@RequestMapping("/showItems")
//	public String showResult(@RequestParam(name="itemtype",required=false, defaultValue="sam")String chain, Model model)
//	{
//		System.out.println("item description"+chain);
//		
//		List<Jewels> jewelList= jewelRepo.findJewel("gold","necklace");		
//		model.addAttribute("jewelList", jewelList);		
//		return "showItems";
//	}
	
	@RequestMapping("/shop")
	public String showList(@RequestParam("type")String itemType, Model model)
	{
		String[] item= itemType.split("-");
		
		List<Jewels> jewelList= jewelRepo.findJewel(item[0],item[1]);		
		model.addAttribute("jewelList", jewelList);		
		return "showItems";
		
	
	}
	

}
