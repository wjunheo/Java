package chapter06_oop;

public class CarExample {

	public static void main(String[] args) {
// ��ü ���� (�ν��Ͻ�ȭ)
		Car mycar = new Car();
		
		//�ʵ尪 �б�
		System.out.println("����ȸ��:"+ mycar.company);
		System.out.println(mycar.model);
		System.out.println(mycar.color);
		System.out.println(mycar.maxSpeed);
		System.out.println(mycar.speed);
		
		//�ʵ尪 ����
		mycar.speed = 60;
		System.out.println("������ �ӵ�:" + mycar.speed);
	}


}
