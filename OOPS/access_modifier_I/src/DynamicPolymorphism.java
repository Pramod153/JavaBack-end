package access_modifier_1;

class ParentClass{
	public void m1() {     //private doesn't used.
		System.out.println(" parent class method");
	}
}
class ChildClass extends ParentClass{
	@Override   //it shows user to m1() method is already used in parentClass.
	public void m1() {
		super.m1();
		
		System.out.println(" child class method");
	}
	public static void m3() {
//		super.m1(); cant use in static method
		//this.m3(); cant use in static method
	}
}

public class DynamicPolymorphism {

	public static void main(String[] args) {
//		ParentClass p = new ParentClass();
//		p.m1();
		ParentClass p1 = new ChildClass();  //dynamic dispatch
		p1.m1();
	}

}

