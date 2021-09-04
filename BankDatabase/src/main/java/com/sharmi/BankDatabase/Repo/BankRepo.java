package com.sharmi.BankDatabase.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharmi.BankDatabase.Model.Bank;

public interface BankRepo  extends JpaRepository<Bank, Integer>{

}
