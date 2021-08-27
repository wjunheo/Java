package ch06_05;

public class calculator {
	//field
	static double pi = 3.14159;
	int x; 
	int y;
	
	//생성자 정의 안함 = 기본 생성자 쓴다는뜻
	
	// method
	static int plus(int x, int y) {
		return x + y;
//		return this.x + this.y; 이거 못씀 왜냐면 스테틱이아니고 인스턴스이기떄문에
	}
	static int minus ( int x, int y) {
		return x - y ;
	}
}
