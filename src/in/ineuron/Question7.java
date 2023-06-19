package in.ineuron;

class Node1 {
    int data;
    Node1 prev;
    Node1 next;

    public Node1(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

class DoublyLinkedList {
    Node1 head;

    public void reverse() {
        Node1 current = head;
        Node1 temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    public void push(int data) {
        Node1 newNode = new Node1(data);
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

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

public class Question7 {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.push(4);
        dll.push(3);
        dll.push(2);
        dll.push(1);

        dll.reverse();
 
        dll.printList();
    }
}
