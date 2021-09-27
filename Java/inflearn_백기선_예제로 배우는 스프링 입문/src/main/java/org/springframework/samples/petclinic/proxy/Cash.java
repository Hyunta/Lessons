package org.springframework.samples.petclinic.proxy;

public class Cash implements Payment {
	@Override
	public void pay(int amount) {
		System.out.println("amount = " + amount);
		System.out.println("현금결제");
	}
}
