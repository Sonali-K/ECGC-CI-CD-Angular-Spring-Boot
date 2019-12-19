package com.cdac.ecgc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.ecgc.model.Bank;


@Repository
public interface BankDao extends JpaRepository<Bank, Integer>{
	Bank findById(int id);

	List<Bank> findByBankBranchName(String bankBranchName);

	Bank deleteByBankBranchCode(int bankBranchCode);
	
}
