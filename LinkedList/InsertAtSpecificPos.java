class InsertAtSpecificPos{
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;

    //Insert at the end
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
    //Insert at specific position
    public void insertAt(int data,int position)
    {
        Node newNode = new Node(data);
        if(position==1)
        {
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp = head;
        int i=1;
        while(i<position-1 && temp!=null)
        {
            temp = temp.next;
            i++;
        }
        if (temp == null)
        {
            System.out.println("Invalid Position");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    // Display list
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
        InsertAtSpecificPos list = new InsertAtSpecificPos();

        list.insert(10);
        list.insert(20);
        list.insert(40);

        System.out.println("Original List:");
        list.display();

        list.insertAt(30, 3);

        System.out.println("After inserting 30 at position 3:");
        list.display();
    }
}
