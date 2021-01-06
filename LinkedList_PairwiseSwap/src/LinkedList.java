
public class LinkedList {
	
	Node head;
	
	
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static void printLinkedList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	static void swapPairWise(Node head) {
		if (head.next == null)
			return;
		
		Node first = head;
		Node second = head.next;
		
		while(first != null && second != null) {
			int temp = first.data;
			first.data = second.data;
			second.data = temp;
			
			if(second.next == null)
				break;
			
			
			first = first.next.next;
			second = second.next.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		
		System.out.println("Before swap");
		printLinkedList(list.head);
		
		swapPairWise(list.head);
		
		System.out.println("After swap");
		printLinkedList(list.head);
	}

}
