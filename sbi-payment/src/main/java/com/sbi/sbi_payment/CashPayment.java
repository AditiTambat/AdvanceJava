package com.sbi.sbi_payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CashPayment implements Ipayment {

	@Override
	public String sendMoney() {
		System.out.println("send money by cashpayment.");
		return "Send-Money";
	}

	@Override
	public String getMoney() {
		System.out.println("recieved money by cashpayment.");
		
		return "Recieved-Money";
	}

}
