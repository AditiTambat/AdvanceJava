package com.sbi.sbi_payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MakePayment {
	
	@Autowired
	@Qualifier("card")
	Ipayment payment;
	
	public void PaymentDone() {
		payment.sendMoney();
		payment.getMoney();
	}

}
