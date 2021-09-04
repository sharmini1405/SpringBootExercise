package com.sharmi.BankDatabase.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharmi.BankDatabase.Model.Bank;
import com.sharmi.BankDatabase.Repo.BankRepo;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	private BankRepo repo;
	
	
	@GetMapping
	public List<Bank> getAll()
	{
		return repo.findAll();
	}
	@GetMapping("/{id}")
	public Bank get(@PathVariable("id") int id)
	{
		return repo.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Bank bank)
	{
		repo.save(bank);
	}
	@PutMapping
	public void update(@RequestBody Bank bank)
	{
		repo.save(bank);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id)
	{
		repo.deleteById(id);
	}
	
}
