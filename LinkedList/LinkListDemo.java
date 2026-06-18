//Link list - insert,delete,display
public class LinkListDemo {
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    private Node head;

    //Insert at the end
    public void insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    //Delete at the end
   public void delete(int key)
{
    if(head == null)
    {
        System.out.println("List is empty");
        return;
    }

    // If the head node contains the key
    if(head.data == key)
    {
        head = head.next;
        return;
    }

    Node temp = head;
    Node prev = null;

    while(temp != null && temp.data != key)
    {
        prev = temp;
        temp = temp.next;
    }

    // Key not found
    if(temp == null)
    {
        System.out.println("Element not found");
        return;
    }

    // Delete the node
    prev.next = temp.next;
}
    //Display linked list
    public void display()
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.println("List is empty");
            return;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args)
    {
        LinkListDemo list=new LinkListDemo();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Linked List:");
        list.display();

        list.delete(20);

        System.out.println("After deleting 20:");
        list.display();
    }
}
