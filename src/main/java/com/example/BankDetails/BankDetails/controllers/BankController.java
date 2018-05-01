package com.example.BankDetails.BankDetails.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankDetails.BankDetails.models.BankBranches;
import com.example.BankDetails.BankDetails.models.Branches;
import com.example.BankDetails.BankDetails.repo.BankBranchRepository;
import com.example.BankDetails.BankDetails.repo.BranchRepository;

@RestController
public class BankController {
	
	@Autowired
	BranchRepository repo;
	
	@Autowired
	BankBranchRepository bankbranchrepo;

	@GetMapping("/branch/{ifsc}")
	public Branches findBranchDetail(@PathVariable("ifsc") String ifsc) {
		Branches branch = repo.findByIfsc(ifsc);
		return branch;
	}
	
	@GetMapping("/bank/{bank_name}/city/{city}")
	public List<BankBranches> findByBankNameAndCity(@PathVariable("bank_name") String bank_name,
													@PathVariable("city") String city){
		List<BankBranches> bankBranches = bankbranchrepo.findByBank_nameIgnoreCaseLikeAndCityIgnoreCaseLike(bank_name, city);
		return bankBranches;
	}
}
