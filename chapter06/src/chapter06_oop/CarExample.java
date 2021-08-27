package chapter06_oop;

public class CarExample {

	public static void main(String[] args) {
// 객체 생성 (인스턴스화)
		Car mycar = new Car();
		
		//필드값 읽기
		System.out.println("제작회사:"+ mycar.company);
		System.out.println(mycar.model);
		System.out.println(mycar.color);
		System.out.println(mycar.maxSpeed);
		System.out.println(mycar.speed);
		
		//필드값 변경
		mycar.speed = 60;
		System.out.println("수정된 속도:" + mycar.speed);
	}


}
