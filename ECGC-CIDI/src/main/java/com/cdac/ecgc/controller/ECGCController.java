package com.cdac.ecgc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.ecgc.dao.BankDao;
import com.cdac.ecgc.model.Bank;
import com.cdac.ecgc.service.BankService;

@RestController
@RequestMapping("/bank")
@CrossOrigin(origins ="*")
public class ECGCController {

	@Autowired
	BankService service;
	
	@Autowired
	BankDao repository;

	
	
	
	
	// http://localhost:8082/bank/save  --POST
	@PostMapping("/save")
	public String addBank(@RequestBody Bank bank) {
		System.out.println("rest server : add movie " + bank);
		service.savedetails(bank);
		return "Successfully added";
	}

	/*
	 * //http://localhost:8082/bank/delete/26 ---DELETE
	 * //@PutMapping(value="/delete/{id}")
	 * 
	 * @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	 * 
	 * public String deleteBank(@PathVariable int id) {
	 * System.out.println("rest server : delete bank " + id);
	 * service.deleteBank(id); return "Successfully deleted"; }
	 */

	
	
	
	  //http://localhost:8082/bank/delete/26 ---DELETE
	  //@PutMapping(value="/delete/{id}")
	  
	  @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	  
	  public List<Bank> deleteBank(@PathVariable int id) {
	  System.out.println("rest server : delete bank " + id);
	  service.deleteBank(id); 
	  return service.FindBankAll(); }
	 
	  
	 // @DeleteMapping("/cancel/{bankBranchCode}")
	  @RequestMapping(value="/cancel/{bankBranchCode}", method = RequestMethod.DELETE)

	    public List<Bank> cancelBankData(@PathVariable int bankBranchCode) {
	        repository.deleteByBankBranchCode(bankBranchCode);
	        return repository.findAll();
	    }
	
	  
	  
	//  http://localhost:8082/bank/find/25   GET
	@GetMapping("/find/{id}")
	public Bank findBank(@PathVariable int id) {
		System.out.println("rest server : find bank " +id);
		Bank bank=service.findBank(id);
		System.out.println(bank);
		return bank;
	}

	// http://localhost:8082/bank/findc/pune  GET

	  @RequestMapping(value="/findc/{bankBranchName}", method = RequestMethod.GET)

	//  @GetMapping(value="/findc/{bankBranchName}", method=RequestMethod.GET)
	  public List<Bank>
	  findBank(@PathVariable String bankBranchName) { 
		  return
	  repository.findByBankBranchName(bankBranchName);
		  }
	 

	//http://localhost:8082/bank/findall    GET
	@GetMapping("/findall")
	public List<Bank> findBankAll() {
		//System.out.println("rest server : find bank " +id);
		List<Bank> b=service.FindBankAll();
		System.out.println(b);
		return b;
	}

	/*
	 * @RequestMapping(value="/update/{id}", method = RequestMethod.PUT) public Bank
	 * updateBank(@PathVariable int id) {
	 * System.out.println("rest server : find bank " +id); Bank
	 * bank=service.findBank(id); service.savedetails(bank);
	 * 
	 * System.out.println(bank); return bank; }
	 */

}
