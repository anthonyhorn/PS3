package PS3;

import java.sql.Date;

public class Account{

	private int id= 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account(){
	}
	
	public Account(int id, double balance){
		this.id=id;
		this.balance=balance;
	}
	
	public int getId(){
		return this.id;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate= annualInterestRate;
	}
	
	public Date getDate(){
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return this.annualInterestRate/12;
	}
	

	public void withdraw(double withdraw){
		this.balance-=withdraw;
	}
	
	public void deposit(double deposit){
		this.balance+=deposit;
	}

}

