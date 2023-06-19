package in.ineuron;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode ll=new LinkedListNode();
		ll.add(5);
		ll.add(2);
		ll.add(3);
		ll.add(8);
		
		LinkedListNode ll1=new LinkedListNode();
		ll1.add(1);
		ll1.add(7);
		ll1.add(4);
		ll1.add(5);
		
		
		LinkedListNode ll3=new LinkedListNode();
		ll3.add(2);
		ll3.add(8);
		ll3.add(9);
		ll3.add(3);
		
		LinkedListNode ll4=new LinkedListNode();
		ll4.add(5);
		ll4.add(3);
		ll4.add(6);
		ll4.add(4);
		
		Node head= newLinkedList(ll.head,ll1.head );
		while(head!=null) {
			System.out.print(head.data+"--->");
			head=head.next;
		}
		System.out.println();
		Node head1= newLinkedList(ll3.head,ll4.head );
		while(head1!=null) {
			System.out.print(head1.data+"--->");
			head1=head1.next;
		}

	}
	
	public static Node newLinkedList(Node head1, Node head2) {
		Node head=new Node(-1);
		Node temp=head;
		while(head1!=null) {
			temp.next=(head1.data>head2.data)?new Node(head1.data):new Node(head2.data);
			head1=head1.next;
			head2=head2.next;
			temp=temp.next;
		}
		
		return head.next;
	}

}
