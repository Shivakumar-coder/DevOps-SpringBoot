package com.thbs.service;

import java.util.List;

import com.thbs.entity.Jewels;

public interface JewelleryServiceInterface {
	
	public List<Jewels> allJewels ();
	public void deleteJewel(int jewel_id);
	public List<Integer> getId();
	
}
