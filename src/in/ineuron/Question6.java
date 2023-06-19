package in.ineuron;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode ll=new LinkedListNode();
		ll.add(1);
		ll.add(3);
		ll.add(4);
		ll.add(7);
		
		LinkedListNode ll1=new LinkedListNode();
		ll1.add(2);
		ll1.add(5);
		ll1.add(6);
		ll1.add(8);
		
		Node head=merge(ll.head, ll1.head);
		head.print();

	}
	
	public static Node merge(Node head1, Node head2) {
		
		Node head3=new Node(-1);
		Node temp=head3;
		
		while(head1!=null && head2!=null) {
			if(head1.data<head2.data) {
				Node temp1=head1.next;
				head1.next=null;
				temp.next=head1;
				head1=temp1;
			}else {
				Node temp1=head2.next;
				head2.next=null;
				temp.next=head2;
				head2=temp1;
			}
			temp=temp.next;
		}
		
		if(head1!=null) {
			temp.next=head1;
		}
		
		if(head2!=null) {
			temp.next=head2;
		}
		return head3.next;
	}

}
