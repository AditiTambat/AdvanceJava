package com.sbi.sbi_payment;

import org.springframework.stereotype.Component;

@Component("card")
public class CardPayment implements Ipayment {

	@Override
	public String sendMoney() {
		System.out.println("send money by cardpayment.");
		return "send-money-by-card";
	}

	@Override
	public String getMoney() {
		System.out.println("Recieved money by cardpayment.");
		return "recieved-money-by-card";
	}

}
