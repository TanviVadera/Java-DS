//link list
import java.util.LinkedList;
import java.util.Scanner;
class Student
{
    int id;
    String name;
    int marks;

    public Student(int id,String name,int marks)
    {
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
    @Override
    public String toString()
    {
        return id+" "+name+" "+marks+" ";
    }
}
public class LinkListDemo
{
    public static void main(String[] args)
    {
        LinkedList<Student> studentlist=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Remove Student by ID");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();


            switch(choice)
            {
                case 1:
                    System.out.println("Enter student id:");
                    int id=sc.nextInt();

                    System.out.println("Enter student name:");
                    String name=sc.next();

                    System.out.println("Enter Student marks:");
                    int marks=sc.nextInt();

                    studentlist.add(new Student(id,name,marks));
                    System.out.println("Data added sucessfully!");
                    break;


                case 2:
                    System.out.println("\n-------student list---------");
                    if(studentlist.isEmpty())
                    {
                        System.out.println("NO student found!");
                    }
                    else
                    {
                        for(Student s:studentlist)
                        {
                            System.out.println(s);
                        }
                    }
                    break;


                case 3:
                    System.out.println("Enter id for search student");
                    int searchId=sc.nextInt();

                    boolean found=false;
                    for(Student s:studentlist)
                    {
                        if(s.getId()==searchId)
                        {
                            System.out.println("Student found:"+s);
                            found=true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.println("Enter id for remove:");
                    int removeId=sc.nextInt();
                    boolean removed=studentlist.removeIf(s->s.getId()==removeId);
                    if (removed) 
                    {
                        System.out.println("Student removed successfully!");
                    } 
                    else 
                    {
                        System.out.println("Student not found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}