package chapter06_4;

public class Car {
	//field
	int gas;
	//criador sem
	// metodo
	void setGas(int gas) { 
		this.gas = gas;
	}
		
		boolean isleftgas() {
			if(gas == 0) {
		System.out.println("sem gas");
		return false;
	}
			System.out.println("tem gas");
			return true;

}
			void run() {
				while (true) {
					if (gas>0) {
						System.out.println("corrend.(nivel de gas:" +gas + ")");
						gas -= 1;
					}else {
						System.out.println("parou.(nivel de gas:"+gas+")");
						return;
					}
				}
			}
}