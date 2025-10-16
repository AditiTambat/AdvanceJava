package com.model.model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Company {  
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String cname;
    
    private double valuation;
    
    
    
    public double getValuation() {
		return valuation;
	}
	public void setValuation(double valuation) {
		this.valuation = valuation;
	}
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

//    @OneToOne
//    @JoinColumn
//    private Ceo ceo;
//
//    @OneToOne
//    @JoinColumn
//    private Hq hq;

	
    
    
    
    

}
