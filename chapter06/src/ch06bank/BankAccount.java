package ch06bank;

public class BankAccount {
	String name;
	String number;
	int balance;
	
	// 생성자 
	public BankAccount(String name) {
		this(name,"123-456",0);
	}
	public BankAccount(String name, String number) {
		this(name,number,0);//두개니까 마지막값초기화
		//		this.name = name;
//		this.number = number;
	}
	public BankAccount(String name,String number,int balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;
	}
	public void deposit(int amount) {
		this.balance += amount;
		
	}
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	public void checkBalance() {
		System.out.println("현재잔고:" +checkBalance);		
	}
}
