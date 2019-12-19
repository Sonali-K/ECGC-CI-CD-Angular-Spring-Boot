package com.cdac.ecgc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.ecgc.dao.BankDao;
import com.cdac.ecgc.model.Bank;

@Service
public class BankService {

	@Autowired
	BankDao repository;
	
	public Bank findBank(int id) {
		return repository.findById(id);
		 //return "Success";
	}
	
	public String savedetails(Bank b) {
		System.out.println(b);
		 repository.save(b);
		 return "Success";
	}
	
	
	public void deleteBank(int id) {
		 repository.deleteById(id);
		 //return "Success";
	}
	
	public List<Bank> FindBankAll() {
		List<Bank> b=repository.findAll();
		 return b;
	}
	
	
	
	
}
