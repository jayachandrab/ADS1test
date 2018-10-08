
class Node{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
	}
	
}


public class LinkedList 
{
	Node head;
	Node tail;
	
	void addLast(int data) 
	{
		Node newNode=new Node(data);
		
		if(head==null && tail==null) 
		{
			head=tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=tail.next;
		}
	}
	public String toString() {
		String re="";
		
		Node temp=head;
		//Node fast=head;
		while(temp!=null) {
			//System.out.println(temp.data);
			//fast=fast.next.next;
			re=re+temp.data;
			temp=temp.next;
		}
		return re;
		
		
	}
	void display() {
		System.out.println("Elements in list");
		Node temp=head;
		//Node fast=head;
		while(temp!=null) {
			System.out.println(temp.data);
			//fast=fast.next.next;
			temp=temp.next;
		}
		
	}
	

}
