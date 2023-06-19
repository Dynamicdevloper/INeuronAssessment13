package in.ineuron;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode ll=new LinkedListNode();
		ll.add(1);
		ll.add(2);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		int[] b= {4,4};
		Node head=reverseKNodes(ll.head, b, 2);
		head.print();
		
	}
	
	
	public static Node reverseKNodes(Node head, int[] b, int n) {
		return reverseKNodesHelper(head, 0, n, b);
	}


	private static Node reverseKNodesHelper(Node head, int i, int n, int[] b) {
		
		if(head==null || head.next==null || i==n) return head;
		int count=1;
		Node temp=head;
		while(temp!=null && count++<b[i]) {
			temp=temp.next;
		}
		Node temp1=null;
		if(temp!=null) {
			temp1=temp.next;
			temp.next=null;
		}
		
		Pair rev= reverse(head);
		if(i+1< n && b[i+1]==0) i++;
		rev.back.next=reverseKNodesHelper(temp1, i+1, n, b);
		return rev.front;
	}


	private static Pair reverse(Node head) {
		if(head==null || head.next==null) {
			Pair p=new Pair();
			p.front=head;
			p.back=head;
			return p;
		}
		
		Pair pair= reverse(head.next);
		head.next=null;
		pair.back.next=head;
		pair.back=pair.back.next;
		
		
		return pair;
	}
	
	

}


class Pair{
	Node front;
	Node back;
}
