package access_modifier_1;


class Base{
	int a=10;
	
}
class Child1 extends Base{
	int a=20;
	public void m1() {
		int a=30;
		System.out.println(a);//30
		System.out.println(this.a);//20;
		System.out.println(super.a);
	}
}
public class SuperWithVariables {

	public static void main(String[] args) {
		
		Child1 ch =new Child1();
		ch.m1();
	}

}
