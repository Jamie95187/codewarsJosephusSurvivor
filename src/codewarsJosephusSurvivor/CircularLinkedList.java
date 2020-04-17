package codewarsJosephusSurvivor;

class Node {
	int value;
	Node nextNode;
	
	public Node(int value) {
		this.value = value;
	}
	
	public int getNode() {
		return this.value;
	}
}

public class CircularLinkedList {
	private Node head = null;
	private Node tail = null;
	
	// Add new element
	
	public void addNode(int value) {
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
		} else {
			tail.nextNode = newNode;
		}
		
		tail = newNode;
		tail.nextNode = head;
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
						tail = currentNode;
						break;
					}
					currentNode = currentNode.nextNode;
				} while (currentNode != head);
			}
		}
	}
}
