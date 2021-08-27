package ch06_05;

public class Singleton {
//	필드
	private static Singleton singleton = new Singleton();
	
	private Singleton( ) {}// 생성자
	//메소드
	static Singleton getInstance() {
		return singleton;
	}

}
