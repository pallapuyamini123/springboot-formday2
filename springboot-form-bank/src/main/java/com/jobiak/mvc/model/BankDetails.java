package com.jobiak.mvc.model;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
//JPA->is a standard and a specification for developing ORM frameworks
//->Object Relation Mapping
//bean,model,CommandObject,Entity
@Entity
@Table(name="bank")
public class BankDetails {
	
	
    @Id//primary key
    private Long acctno;
	private String name;
	
	private String type;
	private Long balance;
	private String location;
	

	public BankDetails() {
		// TODO Auto-generated constructor stub
	}


	public Long getAcctno() {
		return acctno;
	}


	public void setAcctno(Long acctno) {
		this.acctno = acctno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Long getBalance() {
		return balance;
	}


	public void setBalance(Long balance) {
		this.balance = balance;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}

	
}

	

	
	

