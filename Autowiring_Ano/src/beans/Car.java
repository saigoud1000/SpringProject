package beans;

import org.springframework.beans.factory.annotation.Autowired;


public class Car {
	
	@Autowired
	private Engine engine;
	public void PrintData(){
		System.out.println("Model :" + engine.getModel());
	}
}