package com.collection.list;


class Node{
	int data;
	Node next;
	
	// constructor
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class sll{
	Node head;
	public void printLinkedList() {
		
		Node currentNode= head;
		System.out.println("head--->");
		while(currentNode!= null) {
			System.out.println(currentNode.data+"---->");
			currentNode =currentNode.next;
		}
		System.out.print("null");
		System.out.println();
		
	}
	 
	

	public void addNodeAtBeginning(Node newNode) {
		if(head== null) {
			newNode.next = head;
			head= newNode;
			return;
		}
		Node currentNode= head;
		newNode.next = currentNode;
		head= newNode;
	}
	
	public void addNodeAtEnd(Node newNode) {
		Node currentNode =  head;
		while(currentNode.next!=null) {
			currentNode=currentNode.next;
		}
		currentNode.next=newNode;
	
//		if(head== null) {
//			head= currentNode;
//			currentNode.next = null;
//			
//			return;
//		}
//		Node currentNode= head;
//		newNode.next = currentNode;
//		head= newNode;
	}
	public void add(int position , Node newNode) {
		
		if(position==1) {
			this.addNodeAtBeginning(newNode);
			return;
		}
		Node prevNode = null;
		Node currentNode = head;
		int count =1;
		while(count!= position) {
			prevNode = currentNode;
			currentNode = currentNode.next;
			count++;
		}
		newNode.next=currentNode;
		prevNode.next=newNode;
		
	}
	public int getLength() {
		Node currentNode = head;
		int count =0;
		while(currentNode!=null) {
			count++;
			currentNode= currentNode.next;
		}
		System.out.println("length of ll is:"+count);
		return count;
		
	}
	public void updateNode(int position, int NewData) {
		Node currentNode = head;
		if(position == 1) {
			currentNode.data = NewData;
			return;
		}
		int count =1;
		while (count!=position) {
			currentNode = currentNode.next;
			count++;
		}
		currentNode.data=NewData;
		
	}
	public void deleteNodeFrombeg() {
		Node currentNode= head;
		if(isEmpty()) {
			System.out.println("empty");
			return;
			
		}
		head = currentNode.next;
	}
	public void deletNodeFromEnd() {
		Node currentNode= head;
		if(isEmpty()) {
			System.out.println("empty");
			return;
		}
		Node currentNode1 = head;
        Node prevNode = null;
        while (currentNode1.next != null) {
            prevNode = currentNode1;
            currentNode1 = currentNode1.next;
        }
        prevNode.next = null;
	}
	public boolean isEmpty() {
		Node currentNode = head;
		if(currentNode== null) return true;
		return false;
	}
	
	public void deleteNodeFromPosition(int position) {
		

	 if (position == 1) { 
	        head = head.next;
	        return;
	    }
	Node prevNode = null;
    Node currentNode = head;
    int count = 1;

    while (currentNode != null && count < position) {
        prevNode = currentNode;
        currentNode = currentNode.next;
        count++;
    }

    if (currentNode == null) { 
        System.out.println("Position out of bounds.");
        return;
    }

    prevNode.next = currentNode.next;
	
	}
	public void addNodeAtBeginFromEndSide(Node newNode) {
		Node currentNode= head;
		while(currentNode.next!=null) {
			currentNode = currentNode.next;
		}
		currentNode.next=newNode;
	}
	public void addNodeAtPositionFromEnd(int pos, Node newNode) {
		int AP= (getLength()-(pos-1));
		Node currentNode = head;
		Node prevNode=null;
		int count=1;
		while(count!=(AP+1)) {
			prevNode = currentNode;
			currentNode = currentNode.next;
			count++;
		}
		newNode.next= currentNode;
		prevNode.next= newNode;
	}
	public void reversed() {
		Node CN= head;
		Node prev= null;
		Node next = null;
		while(CN!= null) {
			next=CN.next;
			CN.next=prev;
			prev=CN;
			CN= next;
		}
		head=prev;
		
	}
	public void sort() {
		Node CN = head;
	}
}
public class SinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 =new Node(10);
		Node n2= new  Node(20);
		Node n3= new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node (50);
		sll obj = new sll();
		obj.printLinkedList();
		obj.addNodeAtBeginning(n1);
		obj.addNodeAtBeginning(n2);
		
		obj.printLinkedList();
		obj.addNodeAtEnd(n3);
		obj.addNodeAtEnd(n4);
		obj.printLinkedList();
//		obj.add(2,n4);
		obj.getLength();
		obj.updateNode(2, 100);
		obj.printLinkedList();
		
//		obj.deleteNodeFrombeg();
//		obj.printLinkedList();
//		
//		obj.deletNodeFromEnd();
//		obj.printLinkedList();
		
		obj.updateNode(2, 50);
		obj.updateNode(2, 1000);
		obj.printLinkedList();
		
//		obj.deleteNodeFromPosition(1);
//		obj.printLinkedList();
		
		Node n6=new Node(200);
		
		obj.addNodeAtBeginFromEndSide(n6);
		obj.printLinkedList();
		
		Node n7= new Node(300);
		obj.addNodeAtPositionFromEnd(2, n7);
		obj.printLinkedList();
		
		obj.reversed();
		obj.printLinkedList();
	}

}
