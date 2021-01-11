
public class LinkedList {
	
	static Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	void printList(Node node) {
		while(node != null) {
			System.out.print(node.data+ " ");
			node = node.next;
		}
	}
	
	Node reverseList(Node node) {
		Node head = node;
		Node prev = null;
		Node next = null;
		while(node != null) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
		}
		head = prev;
		return head;
		
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
 
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverseList(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);

	}

}
