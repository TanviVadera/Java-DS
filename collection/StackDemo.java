//stack
import java.util.Scanner;
import java.util.Stack;

public class StackDemo 
{

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        while(true)
        {
            System.out.println("\n===== STACK OPERATIONS MENU =====");
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. Peek top element");
            System.out.println("4. Check if empty");
            System.out.println("5. Display stack");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element to push: ");
                    int push = sc.nextInt();
                    stack.push(push);
                    System.out.println("Element pushed!");
                    break;

                case 2:
                    if(!stack.isEmpty())
                    {
                        System.out.println("popped element:"+stack.pop());
                    }
                    else 
                    {
                        System.out.println("Stack is empty!");
                    }
                    break;

                case 3:
                    if(!stack.isEmpty())
                    {
                        System.out.println("Top element:"+stack.peek());
                    }
                    else
                    {
                        System.out.println("Stack is empty!");   
                    }
                    break;

                case 4:
                    System.out.println("Is stack is empty:"+stack.isEmpty());
                    break;

                case 5:
                    System.out.println("Stack elements:"+stack);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
                
                }

             }
        }
    }