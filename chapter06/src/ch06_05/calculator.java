package ch06_05;

public class calculator {
	//field
	static double pi = 3.14159;
	int x; 
	int y;
	
	//������ ���� ���� = �⺻ ������ ���ٴ¶�
	
	// method
	static int plus(int x, int y) {
		return x + y;
//		return this.x + this.y; �̰� ���� �ֳĸ� ����ƽ�̾ƴϰ� �ν��Ͻ��̱⋚����
	}
	static int minus ( int x, int y) {
		return x - y ;
	}
}
