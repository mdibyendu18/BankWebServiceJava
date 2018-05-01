package com.example.BankDetails.BankDetails.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.BankDetails.BankDetails.models.BankBranches;

@Repository
public interface BankBranchRepository extends JpaRepository<BankBranches, String> {
	
	public List<BankBranches> findByBank_nameIgnoreCaseLikeAndCityIgnoreCaseLike(String bank_name, String city);
 
}
