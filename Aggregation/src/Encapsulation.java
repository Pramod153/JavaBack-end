package com.aggregation;


class User{
	private final String userName ="user" ;
	private final String userPassword="user" ;
	
	public String getUserName() {
		return this.userName;
		
	}
	
	public String getUserPassword() {
		return this.userPassword;
	}
//	public void setUserName(String user) {
//		this.userName=user;
//	}
//	public void setUserPassword(String Password) {
//		this.userPassword=Password;
//	}
}
public class Encapsulation {

	public static void main(String[] args) {
		
		User  u1 = new User();
		User u2= new User();
		
//		u1.setUserName("user1");
//		u1.setUserPassword("user123");
//		
//		u2.setUserName("user2");
//		u2.setUserPassword("user1234");
		System.out.println(u1.getUserName());
		System.out.println(u2.getUserName());
		
		
	}

}
