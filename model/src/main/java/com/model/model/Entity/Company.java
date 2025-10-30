package com.model.model.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class Company {  
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comid;

	
    private String comname;
    
    private double valuation;
    
    

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ceo_id")  
	private Ceo ceo;



	public int getComid() {
		return comid;
	}






	public String getComname() {
		return comname;
	}



	public void setComname(String comname) {
		this.comname = comname;
	}



	public double getValuation() {
		return valuation;
	}



	public void setValuation(double valuation) {
		this.valuation = valuation;
	}



	public Ceo getCeo() {
		return ceo;
	}



	public void setCeo(Ceo ceo) {
		this.ceo = ceo;
	}

	
	
	
	
	
	
	
	
//
//    @OneToOne
//    @JoinColumn
//    private Hq hq;

	
    
    
    
    

}
