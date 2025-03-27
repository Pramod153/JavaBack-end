package access_modifier_1;


//super : always refers to parent class
//super keyword with default constructor
// super keyword wirh parametrized constructor
class Parent{
	
	
	Parent(int a){
		
		System.out.println("parent constructor called");
	}
	
}
class Child extends Parent{
	Child(){
//		this(10);
		super(10);//Constructor call must be the first statement in a constructor
		System.out.println("child constructor called");
		
	}
	
}

public class SingleInheritance1 {

	public static void main(String[] args) {
		
		Child ch = new Child();

	}

}
