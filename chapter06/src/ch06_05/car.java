package ch06_05;

public class car {

	//field
	String model;
	int speed;
	//criador
	car(String model) {
		this.model = model;

	}
	//metodo
	void setSpeed(int speed) {//��Ʈ ���ǵ尪�� ����
		this.speed = speed; //�򰥸��ϱ� �𽺸� ������
	}
	void run() {
//		for(int i=0; i<=50; i+=10) {
		for (int i=0; i <5; i++) { //5�����ٴ°� �� ��Ȯ��
			this.setSpeed((i+1)*10);
			System.out.printf("%s���޸��ϴ�.(�ü�:%dkm/h)\n",this.model,this.speed);
			
	} System.out.println();
}
}