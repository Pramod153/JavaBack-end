package com.aggregation;


class Car{
	
	private String CarName;
	private Engine engine;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	private Engine e;
//	public Car() {
//		this.e= new Engine();
//		
//	}
//	public void startCar() {
//		sysout
//	}
}
class Engine{
	
	
	
//	public  void start() {
//		System.out.println("engine started");
//		
//	}
//	public void stop() {
//		System.out.println("engine is stopped");
//	}
}
public class CompositionExample {
	public static void main (String[] args) {
		Engine e1= new Engine(5000,"petroleng");
		Car c= new Car("mahindra");
		Car.setEngine(e1);
		System.out.println(car.getCarName()+"----" + car.getEngine);
	}

}
