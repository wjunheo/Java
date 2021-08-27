package ch06bank;
//은행 계좌 기능 구현 

public class bankaccountpop {
	public static void main(String[] args) {
	//계좌최기화 
	int 잔고=0;
	// 입금
	int 입금액 =10000;
	잔고 = 잔고 + 입금액;
	
	// 출금
	int 출금 = 3000;
	잔고 = 잔고 - 출금;
	
	//잔고 출력
	System.out.println(잔고);
}
}