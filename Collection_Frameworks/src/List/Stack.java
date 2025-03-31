package com.collection.list;

class Stk{
	
	private  static int top=-1;
	private static int [] arr;
	private static char [] arr1;
	
	
	Stk(int size){
		arr= new int[size];
		arr1= new char[size];
	}
	
	
	public static boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	public static  boolean isFull() {
		if(top== arr.length-1) {
			return true;
		}
		return false;		
	}
	public static String push(int data)
	{
		if(isFull()) {
			return " stack is Full";
		}
		arr[++top] = data;
		
		return " Stack add successfuly";
	}
	public  static String pop() {
		if(isEmpty()) {
		return " stack is empty";
		}
		int CE= arr[top];
		arr[top--]=0;
		return " element popped : " + CE;
		
	}
	public static String push(char data1) {
		if(isFull()) {
			return " stack is Full";
		}
		arr1[++top] = data1;
		
		return " Stack add successfuly";
	}
	public static char pop1() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			}
			
			return arr1[top --];
			
	}
	public static boolean check(String ch) {
		Stk arr1 = new Stk(ch.length());
		for(char c : ch.toCharArray()) {
			if(c=='{'|| c=='['|| c=='(') {
				arr1.push(c);
			}else if(c=='}'|| c==']'|| c==')') {
				if(arr1.isEmpty()) {
					return false;
				}

              char top = arr1.pop1();
                
                if ((c == '}' && top != '{') || 
                    (c == ']' && top != '[') || 
                    (c == ')' && top != '(')) {
                    return false;
                }
			}
		}
		return  arr1.isEmpty();
		
	}
	
	
}

public class Stack {

		
		
		public static void main(String[] args) {
		
		Stk stack = new Stk(5);
		System.out.println(stack.isEmpty());
		System.out.println(stack.push(1));
		System.out.println(stack.push(2));
		System.out.println(stack.push(3));
		System.out.println(stack.push(4));
		System.out.println(stack.push(5));
		System.out.println(stack.push(6));
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("Bracket Check:");
        System.out.println(Stk.check("{[()]}")); // true
        System.out.println(Stk.check("{[(])}")); // false
        System.out.println(Stk.check("{[}"));    // false
        System.out.println(Stk.check(""));  
		
		
		}

}
