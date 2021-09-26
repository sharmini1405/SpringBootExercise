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
@RequestMapping("/sewer")
public class SewerController {
	@Autowired
	 private SewerRepo repo;
	@Autowired
	private DressRepo dressrepo;
	 @GetMapping
	 public List<Sewer> getAll()
	 {
		 return repo.findAll();
	 }
	 @GetMapping("/{id}")
	 public Sewer get(@PathVariable("id") String id)
	 {
		return repo.findById(id).get();
	 }
	 
	 @PostMapping
	 public void add(@RequestBody Sewer sewer)
	 {
		 repo.save(sewer);
	 }
	 
	 @PutMapping
	 public void update(@RequestBody Sewer sewer)
	 {
		 repo.save(sewer);
	 }
	 @DeleteMapping("/{id}")
	 public void delete(@PathVariable("id") String id)
	 {
		 repo.deleteById(id);
	 }

}
