package Playlist;


public class LinkedList {
	
	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
	}
		
	private Node first;
	private Node last;
		
	// addLast
	public void addLast(int item) {
		Node node = new Node(item);
		
		if(isEmpty()) 
			first = last = node;
			else {
				last.next = node;
				last = node;
		
		}	
	}
	
	// addFirst
	public void addFirst(int item) {
		Node node = new Node(item);
		
		if(isEmpty())
			first = last = node;
		else {
			node.next = first;
			first = node;
		}
	}
	
	private boolean isEmpty() {
		return first == null;
	}
	
	// indexOf
	public int indexOf(int item) {
		int index = 0;
		var current = first;
		while (current != null) {
			if (current.value == item) return index;
			current = current.next;
			index++;
		}
		return -1;
	}
	
	// contains
	public boolean contains(int item) {
		return indexOf(item) != -1;
	}
	
	// deleteFirst
	public void deleteFirst() {
		
		if(first == last) {
			first = last = null;
			return;
		}
		var second = first.next;
		first.next = null;
		first = second;
	}

	// deleteLast
	public void deleteLast() {
		var previous = getPrevious(last);
		last = previous;
		last.next = null;
	}

	private  Node getPrevious(Node node) {
		
		var current = first;
		while(current != null) {
			if (current.next == node) return current;
			current = current.next;
		}
		return null;
	}

}
