package chapter06_4;

public class CarExample {

	public static void main(String[] args) {
		Car mc = new Car();
		mc.setGas(10);
		boolean gasState = mc.isleftgas();
		if (gasState) {
			System.out.println("partiu");
			mc.run();
			
		}
		if(mc.isleftgas()) {
			System.out.println("nao precisa bastar gas");
			
		} else {
			System.out.println("bastace gas");
		}
		
		}

}
