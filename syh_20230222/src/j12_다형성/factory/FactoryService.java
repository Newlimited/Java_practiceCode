package j12_다형성.factory;

import j11_상속.Factory.Factory;

public class FactoryService {
	private Factory factory;
	// j11  상속에 있는 Factory를 들고온다.
	
	public FactoryService(Factory factory) {
		this.factory = factory;
		
	}
	public void factoryStart() {
		factory.start();
	}
	
	public void factoryStop() {
		factory.stop();
		
	}
		
}
