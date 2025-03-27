

package access_modifier_1;

class FourWheeler{
	public void start() {
		System.out.println("the Car starts");
	}
}
class Vehicle1 extends  FourWheeler{
	public void speed() {
		System.out.println("the vehicle is running at moderate speed");
		
	}
}
class Car1 extends Vehicle{
	public void drive() {
		System.out.println("the car is ready to drive");
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

	public void speed() {
		// TODO Auto-generated method stub
		
	}
}

public class MultipleInheritanceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c=new Car1();
		c.start();
		c.speed();
		c.drive();

	}

}
