package com.jobiak.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.mvc.model.BankDetails;
@Repository
public interface UserRepository extends JpaRepository<BankDetails,Long> {

}
