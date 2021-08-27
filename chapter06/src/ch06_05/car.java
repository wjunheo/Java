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
	void setSpeed(int speed) {//인트 스피드값을 받음
		this.speed = speed; //헷갈리니까 디스를 붙혀줌
	}
	void run() {
//		for(int i=0; i<=50; i+=10) {
		for (int i=0; i <5; i++) { //5번돈다는게 더 명확함
			this.setSpeed((i+1)*10);
			System.out.printf("%s가달립니다.(시속:%dkm/h)\n",this.model,this.speed);
			
	} System.out.println();
}
}