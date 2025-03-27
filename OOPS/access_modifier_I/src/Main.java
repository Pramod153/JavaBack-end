package access_modifier_1;

import access_modifier_1.car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj=new car();
		System.out.println(obj.data);
		System.out.println(obj.data2);
		System.out.println(obj.data3);
		Santro s=new Santro();
		System.out.println(s.data3);
		
		System.out.println(obj.getPrivateData());
//	System.out.println(s.getPrivateData());
	}

}
