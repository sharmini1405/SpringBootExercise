package com.sharmi.DressSewer.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharmi.DressSewer.Model.Dress;
import com.sharmi.DressSewer.Model.Sewer;
import com.sharmi.DressSewer.Repo.DressRepo;
import com.sharmi.DressSewer.Repo.SewerRepo;

@RestController
@RequestMapping("/dress")
public class DressController {
	 @Autowired
	 private DressRepo repo;
	 
	 @Autowired
	 private SewerRepo sewerRepo;
	 
	 @GetMapping
	 public List<Dress> getAll()
	 {
		 return repo.findAll();
	 }
	 @GetMapping("/{id}")
	 public Dress get(@PathVariable("id") String id)
	 {
		return repo.findById(id).get();
	 }
	 
	 @PostMapping
	 public void add(@RequestBody Dress dress)
	 {
		 repo.save(dress);
	 }
	 
	 @PutMapping
	 public void update(@RequestBody  Dress dress)
	 {
		 repo.save(dress);
	 }
	 @DeleteMapping("/{id}")
	 public void delete(@PathVariable("id") String id)
	 {
		 repo.deleteById(id);
	 }
	 
	 @PostMapping("/{id}/addsewer")
	 public void addSewer(@PathVariable("id") String dressId,@RequestBody Map<String,String> sewerMap)
	 {
		
		Dress dress = repo.findById(dressId).get();
		Sewer sewer=sewerRepo.findById(sewerMap.get("sewerId")).get();
		dress.getSewers().add(sewer);
	
		repo.save(dress);
	 }
	 
}
