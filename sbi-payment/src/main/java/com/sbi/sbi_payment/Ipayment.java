package com.sbi.sbi_payment;

import org.springframework.stereotype.Component;

@Component
public interface Ipayment {
	
	public String sendMoney();
	
	public String getMoney();

}
