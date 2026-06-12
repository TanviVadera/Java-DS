//queue - Enqueue,Dequeue,Display,Peek

import java.util.Scanner;

class Queue_Array
{
    final int size=100;
    int[] arr=new int[size];
    int front=-1,rear=-1;

    void enqueue(int element)
    {
        if(rear==size-1)
        {
            System.out.println("Queue is oevrflow!");
            return;
        }
        else if(front==-1 && rear==-1)
        {
            front=rear=0;
            arr[rear]=element;
        }
        else
        {
            rear++;
            arr[rear]=element;
        }
    }
    void dequeue()
    {
        if(front==-1)
        {
            System.out.println("Queue is underflow!");
            return;
        }
        else
        {
            System.out.println("Deleted element is:"+arr[front]);
             if(front == rear)
            {
                front = rear = -1;
            }
            else
            {
                front++;
            }
        }
    }
    void peek()
    {
        if(front==-1)
        {
            System.out.println("Queue is underflow!");
            return;
        }
        else
        {
            System.out.println("element is:"+arr[front]);
        }
    }
    void display()
    {
        if(front==-1)
        {
            System.out.println("Queue is underflow!");
            return;
        }
        else
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.println("element is->"+arr[i]);
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Queue_Array q=new Queue_Array();
        int choice;
        while(true)
        {
            System.out.println("--------------------Menu----------------------");
            System.out.println("1.enqueue");
            System.out.println("2.dequeue");
            System.out.println("3.peek");
            System.out.println("4.display");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter element for insert:");
                    int element=sc.nextInt();
                    q.enqueue(element);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    q.display();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invaild choice");
                    System.exit(0);
            }
        }
    }
}
