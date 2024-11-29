package com.control_statements;
import java.util.Scanner;
//nested if

class UserDB{
	static final String userName = "admin";
	static final String password = "admin";
	
}
class UserValidation{
	public static void login(Scanner sc) {
		System.out.println("enter user name");
		String user=sc.next();
		if(user.equalsIgnoreCase(UserDB.userName)) {
			System.out.println("enter password");
			String password =sc .next();
			if(password.equals(UserDB.password)) {
				System.out.println("welcome" + user);
			}else {
				System.out.println("invalid password");
			}
		}else {
			System.out.println("incorrect password");
		}
			
		
	}
}

public class test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserValidation.login(sc);

	}

}
