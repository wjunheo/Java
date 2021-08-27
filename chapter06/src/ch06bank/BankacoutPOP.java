package ch06bank;

public class BankacoutPOP {
		
	public static void main(String[] args) {	
	
		BankAccount KimAccount 
		= new BankAccount("kim");
		
		KimAccount.deposit(10000);
		KimAccount.withdraw(3000);
		KimAccount.checkBalance();
		
		System.out.println(KimAccount.name);
		System.out.println(KimAccount.number);
		System.out.println(KimAccount.balance);
		
	}

}
