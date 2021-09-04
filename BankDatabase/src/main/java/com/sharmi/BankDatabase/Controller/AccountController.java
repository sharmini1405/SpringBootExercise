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

import com.sharmi.BankDatabase.Model.Account;
import com.sharmi.BankDatabase.Model.Bank;
import com.sharmi.BankDatabase.Repo.AccountRepo;
import com.sharmi.BankDatabase.Repo.BankRepo;
@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountRepo repo;
	
	
	@GetMapping
	public List<Account> getAll()
	{
		return repo.findAll();
	}
	@GetMapping("/{id}")
	public Account get(@PathVariable("id") int id)
	{
		return repo.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Account acc)
	{
		repo.save(acc);
	}
	@PutMapping
	public void update(@RequestBody Account acc)
	{
		repo.save(acc);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id)
	{
		repo.deleteById(id);
	}
}
