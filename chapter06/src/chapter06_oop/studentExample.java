package chapter06_oop;

public class studentExample {

	public static void main(String[] args) {
		student s1 = new student(); // s1�̶�� �л���ü�� �������
		System.out.println("s1������ student��ü�� �����մϴ�.");
		s1.num = 1;
		
		
		Student s2 = new student();
		System.out.println("s2 ������ �Ǵٸ� student ��ü�� �����մϴ�");
		System.out.println(s1.num);
		System.out.println(s2.num);
	}

}
