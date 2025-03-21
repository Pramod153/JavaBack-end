package com.aggregation;


interface RBI{
	String getBankName();
}


class SBI implements RBI {
	public String getBankName() {
		return "SBI -SErvices";
	}
}
class Pnb implements RBI{
	public String getBankName() {
		return "Pnb-Services";
	}
}
class Bank{
	private RBI bank;
	Bank(RBI bank){
		this.bank=bank;
	}
	public String getBankName() {
		return this.bank.getBankName();
	}
	
}
public class CodeDriver {

	public static void main(String[] args) {
		
		SBI sbi=new SBI();
		Pnb pnb=new Pnb();
//		Bank bank= new Bank(sbi);
		Bank bank= new Bank(pnb);
		System.out.println(bank.getBankName());
	}

}
