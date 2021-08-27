package chapter06_oop;

public class studentExample {

	public static void main(String[] args) {
		student s1 = new student(); // s1이라는 학생객체가 만들어짐
		System.out.println("s1변수가 student객체를 참조합니다.");
		s1.num = 1;
		
		
		Student s2 = new student();
		System.out.println("s2 변수가 또다른 student 객체를 참조합니다");
		System.out.println(s1.num);
		System.out.println(s2.num);
	}

}
