package com.thbs.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thbs.entity.Jewels;


public interface JewelRepository extends JpaRepository<Jewels, Integer> {
	
	@Query("SELECT j FROM Jewels j WHERE j.jewel_metal=?1 and j.jewel_type=?2")
	public List<Jewels> findJewel(String metal,String type);
	
	@Query("SELECT j.jewel_id FROM Jewels j")
	public List<Integer> getJewelId();
 
}
