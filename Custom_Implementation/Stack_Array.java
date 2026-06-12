//stack - push,pop,peep,display
import java.util.Scanner;
class Stack_Array
{
    final int size=100;
    int top=-1;
    int[] arr=new int[size];
    void push(int element)
    {
        if(top==size-1)
        {
            System.out.println("Stack is overflow!");
            return;
        }
        else
        {
            top++;
            arr[top]=element;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack is underflow!");
            return;
        }
        else
        {
            System.out.println("deleted element is:"+arr[top]);
            top--;
        }
    }
    void peep()
    {
        if(top==-1)
        {
            System.out.println("stack is underflow!");
            return;
        }
        else
        {
            System.out.println("Element is:"+arr[top]);
        }
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("stack is underflow!");
            return;
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println("Elements->"+arr[i]);
            }
        }
    }
   public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Stack_Array s=new Stack_Array();
        int choice;
        while(true)
        {
            System.out.println("--------------------Menu----------------------");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peep");
            System.out.println("4.display");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter element:");
                    int element=sc.nextInt();
                    s.push(element);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peep();
                    break;

                case 4:
                    s.display();
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
