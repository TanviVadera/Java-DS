public class RemoveDuplicateNode {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Remove duplicate nodes (Sorted Linked List)
    public void removeDuplicate() {

        if (head == null) {
            return;
        }

        Node current = head;

        while (current != null && current.next != null) {

            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    // Display linked list
    public void display() {

        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        RemoveDuplicateNode list = new RemoveDuplicateNode();

        list.insert(10);
        list.insert(20);
        list.insert(20);
        list.insert(30);
        list.insert(30);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(50);

        System.out.println("Original List:");
        list.display();

        list.removeDuplicate();

        System.out.println("After Removing Duplicates:");
        list.display();
    }
}
