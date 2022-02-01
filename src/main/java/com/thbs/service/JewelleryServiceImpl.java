package com.thbs.service;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thbs.entity.Jewels;
import com.thbs.repository.JewelRepository;


@Service
@Transactional
public class JewelleryServiceImpl implements JewelleryServiceInterface{

	@Autowired
	private JewelRepository jewelRepo;
	
	
	@Override
	public List<Jewels> allJewels ()
	{
		
		return jewelRepo.findAll();
	}
	
	@Override
	public void deleteJewel(int jewel_id) {
        jewelRepo.deleteById(jewel_id);
    }
	
	@Override
	public List<Integer> getId()
	{
		return jewelRepo.getJewelId();
	}
	

}
