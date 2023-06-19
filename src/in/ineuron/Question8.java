package in.ineuron;

class Doubly extends DoublyLinkedList {
    Node1 head;

    public void deleteNode(int position) {
        if (head == null)
            return;

        Node1 current = head;

        if (position == 0) {
            head = current.next;
            if (head != null)
                head.prev = null;
            return;
        }

        int currentPosition = 0;
        while (current != null && currentPosition < position) {
            current = current.next;
            currentPosition++;
        }

        if (current == null)
            return;


        if (current.prev != null)
            current.prev.next = current.next;
        if (current.next != null)
            current.next.prev = current.prev;

        current = null;
    }

    public void push(int data) {
        Node1 newNode = new Node1(data);
        newNode.next = head;

        if (head != null)
            head.prev = newNode;

        head = newNode;
    }

    public void printList() {
        Node1 current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Question8 {
    public static void main(String[] args) {
        Doubly dll = new Doubly();
        dll.push(4);
        dll.push(3);
        dll.push(2);
        dll.push(1);

        int position = 2;
        dll.deleteNode(position);
        dll.printList();
    }
}

