package lecture_25;

public class Cycle_Removal {

	public class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void addLast(int item) {
		if (size == 0)
			addFirst(item);
		else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	private Node getNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol k to sahi deta");
		}
		Node temp = head;
		for (int i = 0; i < k; i++)
			temp = temp.next;
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;

		}
		System.out.println(".");
	}

	public void CreateCycle(int n) throws Exception {
		tail.next = getNode(n);
	}

	public Node hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

//O(N^2)
	public void Cycleremoval1() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node slow = head;
		while (slow != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == slow) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			slow = slow.next;
		}
	}

//O(N)
	public void Cycleremoval2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		int count = 1;
		Node temp = meet;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}
		Node fast = head;
		for (int i = 0; i < count; i++) {
			fast = fast.next;
		}
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public void floydcycle() {
		Node meet = hasCycle();
		if (meet == null)
			return;
		Node fast = meet;
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public static void main(String[] args) throws Exception {
		Cycle_Removal cy = new Cycle_Removal();
		cy.addLast(1);
		cy.addLast(2);
		cy.addLast(3);
		cy.addLast(4);
		cy.addLast(5);
		cy.addLast(6);
		cy.addLast(7);
		cy.addLast(8);
		cy.CreateCycle(2);
		cy.Cycleremoval1();
		cy.Display();
	}
}
