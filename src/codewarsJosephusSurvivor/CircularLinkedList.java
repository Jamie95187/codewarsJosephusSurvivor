package codewarsJosephusSurvivor;

class Node {
	int value;
	Node nextNode;
	
	public Node(int value) {
		this.value = value;
	}
}

public class CircularLinkedList {
	private Node head = null;
	private Node tail = null;
	
	// Add new element
	
	public void addNode(int value) {
		Node newNode = new Node(value);
		
		if(head == null) {
//			System.out.println("Added node --- " + value);
			head = newNode;
		} else {
//			System.out.println("Added node --- " + value);
			tail.nextNode = newNode;
		}
		
		tail = newNode;
		tail.nextNode = head;
//		System.out.println("Head ---- " + head.value);
//		System.out.println("Tail ---- " + tail.value);
	}
	
	// Traversing list to find element
	
	public boolean containsNode(int searchValue) {
		Node currentNode = head;
		
		if (head == null) {
			return false;
		} else {
			do {
				if (currentNode.value == searchValue) {
					return true;
				}
				currentNode = currentNode.nextNode;
			} while (currentNode !=  head);
			return false;
		}
	}
	
	// Deleting an element
	
	public void deleteNode(int valueToDelete) {
		Node currentNode = head;
		
		if (head != null) {
			if (currentNode.value == valueToDelete) {
				head = head.nextNode;
				tail.nextNode = head;
			} else {
				do {
					Node nextNode = currentNode.nextNode;
					if (nextNode.value == valueToDelete) {
						currentNode.nextNode = nextNode.nextNode;
//						head = currentNode.nextNode.nextNode;
//						tail = currentNode;
						break;
					}
					currentNode = currentNode.nextNode;
				} while (currentNode != head);
			}
		}
	}
	
	public void deleteNodeInStepOfi(int i) {
		Node currentNode = head;
//		System.out.println("Head before delete ---- " + head.value);
		// check if empty	
		if (head != null) {
			for(int k = 1; k < i; k++) {
				currentNode = currentNode.nextNode;
			}
//			System.out.println("Delete node with value --- " + currentNode.value);
//			System.out.println("New head value ---- " + currentNode.nextNode.value);
			head = currentNode.nextNode;
			deleteNode(currentNode.value);
		}
//		tail.nextNode = head;
//		System.out.println("Head After Delete ---- " + head.value);
//		System.out.println("Tail After Delete ---- " + tail.value);
	}
	
	// Getter for head of node, return value of head
	
	public int getHeadValue() {
		return this.head.value;
	}
}
