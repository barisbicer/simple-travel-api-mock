package com.klm.exercises.spring.fares;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

@Value
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fare {

    double amount;
    Currency currency;
    String origin, destination;
	public Fare(double doubleValue, Currency valueOf, String code, String code2) {
		
		 this.amount=doubleValue;
		 this.currency=valueOf;
		 this.origin=code;
		 this.destination=code2;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

    
    

}
