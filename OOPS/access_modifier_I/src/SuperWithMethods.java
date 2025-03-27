package access_modifier_1;

class Super{
	
	public void m1() {
		System.out.println("method from Parent class");
	}
}
class Sub extends Super{
	public void m1() {
		System.out.println("method from Child class");
		super.m1();
	}
}

public class SuperWithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super obj=new Sub();
		obj.m1();
	}

}
