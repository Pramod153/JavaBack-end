package access_modifier_1;



// Parent: Base:Super
//Child:Derived:SubClass

class Vehicle{
	
	String CompanyName="Mahindra";
	public void getCompanyName() {
		System.out.println(this.CompanyName);
	}
	
}
class Car extends Vehicle{
	
	String CompanyName="Honda";
	public void getCompanyName() {
		System.out.println(this.CompanyName);
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c= new Car();
		System.out.println(c.CompanyName);
		
		Vehicle v1=new Car();// dynamic dipatch
		System.out.println(v1.CompanyName);
		
		c.getCompanyName();
		v1.getCompanyName();

	}

}
