package ch06_05;

public class CarExample {

	public static void main(String[] args) {
		
		car mycar = new car("porche");
		car yourcar =new car("mercedes");
		
		mycar.run();
		yourcar.run(); //run의 객체는 하나임
	}

}
