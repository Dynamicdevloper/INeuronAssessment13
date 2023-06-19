package in.ineuron;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		LinkedListNode ll=new LinkedListNode();
		ll.add(1);
		ll.add(2);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(3);
		ll.add(8);
		int k= 2;
		Node head=deleteLastOccurence(ll.head, k);
		head.print();
	}
	
	public static Node deleteLastOccurence(Node head, int k) {
		
		Node temp=reverse(head);
		//temp.print();
		Node temp1=temp;
		while(temp1!=null) {
			if(temp1.data==k ) {
				if(temp1!=null && temp1.next!=null) {
					temp1.data=temp1.next.data;
					temp1.next=temp1.next.next;
				}else {
					temp1.next=null;
				}
				break;
			}
			temp1=temp1.next;
		}
		return reverse(temp);
		
	}

	public static Node reverse(Node head) {
		
		Node prev=null;
		Node post=head;
		while(post!=null) {
			Node curr=post;
			post=post.next;
			curr.next=prev;
			prev=curr;
		}
		return prev;
	}

}
