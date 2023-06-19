package in.ineuron;

public class Node {

	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
	}
	
	public void print() {
		Node temp=this;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		System.out.println();
	}
	
}

class LinkedListNode{
	Node head;
	Node tail;
	
	public LinkedListNode() {
	}
	
	public void add(int data) {
		if(head==null) {
			head = new Node(data);
			tail=head;
			return;
		}
		
		tail.next=new Node(data);
		tail=tail.next;
	}
	
	
}
