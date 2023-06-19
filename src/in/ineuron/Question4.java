package in.ineuron;

public class Question4 {
	
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
		int k= 3;
		Node head=reverseKNodes(ll.head, k);
		head.print();
		
	}
	
	
	public static Node reverseKNodes(Node head, int k) {
		boolean flag=true;
		return reverseKNodesHelper(head, k, flag);
	}


	private static Node reverseKNodesHelper(Node head, int k, boolean flag) {
		
		if(head==null || head.next==null) return head;
		int count=1;
		Node temp=head;
		while(temp!=null && count++<k) {
			temp=temp.next;
		}
		Node temp1=null;
		if(temp!=null) {
			temp1=temp.next;
			temp.next=null;
		}
		
		Pair rev= reverse(head,flag);
		rev.back.next=reverseKNodesHelper(temp1, k,!flag);
		return rev.front;
	}


	private static Pair reverse(Node head, boolean flag) {
		if(flag) {
			if(head==null || head.next==null) {
				Pair p=new Pair();
				p.front=head;
				p.back=head;
				return p;
			}
			
			Pair pair= reverse(head.next,flag);
			head.next=null;
			pair.back.next=head;
			pair.back=pair.back.next;
			
			
			return pair;
		}else {
			if(head==null || head.next==null) {
				Pair p=new Pair();
				p.front=head;
				p.back=head;
				return p;
			}
			Pair p= new Pair();
			Node temp=head;
			p.front=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			p.back=temp;
			return p;
		}
	}
	
	

}


