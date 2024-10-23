package com.basics;
import java.util.Scanner;

class SimpleInterest{
	int P,T;
	float R;
	double SI;
 

 public void setData(int p, int t, float r) {
	 P=p;
	 T=t;
	 R=r;
	}
 public double getData() {
//	 System.out.println("P:"+P+"T:"+T+"R:"+R);
	 SI= (P*T*R)/100;
	 return SI;
		 
	}
}

public class Problem {
	 public static void main (String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the principle");
		 int p=sc.nextInt();
		 System.out.println("enter the time");
		 int t=sc.nextInt();
		 System.out.println("enter the rate");
		 float r=sc.nextFloat();
		 
		  SimpleInterest s = new SimpleInterest();
		   s.setData(p,t,r);
		  
		  System.out.println(s.getData());
		 
	 }

}
