package com.example.BankDetails.BankDetails.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BankDetails.BankDetails.models.Branches;

@Repository
public interface BranchRepository extends JpaRepository<Branches, String> {

	public Branches findByIfsc(String ifsc);


}
