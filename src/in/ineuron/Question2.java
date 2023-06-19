package in.ineuron;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode ll=new LinkedListNode();
		ll.add(11);
		ll.add(11);
		ll.add(11);
		ll.add(21);
		ll.add(43);
		ll.add(43);
		ll.add(60);
		
		Node head =removeDuplicates(ll.head);
		
		LinkedListNode ll1=new LinkedListNode();
		ll1.add(10);
		ll1.add(12);
		ll1.add(12);
		ll1.add(25);
		ll1.add(25);
		ll1.add(25);
		ll1.add(34);
		
		Node head1 =removeDuplicates(ll1.head);
		
		head.print();
		head1.print();

	}
	
	public static Node removeDuplicates(Node head) {
		
		
		if(head == null) return head;
		while(head.next !=null && head.data==head.next.data) {
			head=head.next;
		}

		head.next=removeDuplicates(head.next);
				
		return head;
		
	}

}
