package ch06bank;

public class BankAccount {
	String name;
	String number;
	int balance;
	
	// ������ 
	public BankAccount(String name) {
		this(name,"123-456",0);
	}
	public BankAccount(String name, String number) {
		this(name,number,0);//�ΰ��ϱ� ���������ʱ�ȭ
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
		System.out.println("�����ܰ�:" +checkBalance);		
	}
}
