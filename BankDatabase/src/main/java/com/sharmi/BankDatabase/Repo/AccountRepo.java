package com.sharmi.BankDatabase.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharmi.BankDatabase.Model.Account;

public interface AccountRepo  extends JpaRepository<Account, Integer>{
	
}
