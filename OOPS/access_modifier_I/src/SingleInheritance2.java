package access_modifier_1;

class A{
	A(){
//		this(); //Recursive constructor invocation A()
		System.out.println("parent class constructor");
	}
	A(int a){
		System.out.println("parent class one arg construtor");
	}
}
class B extends A{
	B(){
		this(10);
		System.out.println("child class  no-arg constructor");
	}
	B(int a){
		super();
		System.out.println("child class one-arg constructor");
		
	}
}

public class SingleInheritance2 {
	public static void main(String[] args) {
		B obj= new B();
		
		
	}

}
