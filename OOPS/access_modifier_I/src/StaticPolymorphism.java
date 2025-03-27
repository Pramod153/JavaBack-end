package access_modifier_1;


class Dimension{
	//method overloading
	// and also we overload constructors.
	public static void area(int radius) {
		System.out.println("Area of Circle:" +(Math.PI*radius*radius));
	}
	public static void area(int length,int width) {
		System.out.println("Area of Rectangle:"+(length * width));
	}
	public static void area(float side) {
		System.out.println("area of square"+(side*side));
	}
}
public class StaticPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension.area(12.5f);// compile time polymorphism
		
	}
	public static void main(Integer[] args) {
		// TODO Auto-generated method stub
		
	}
}
