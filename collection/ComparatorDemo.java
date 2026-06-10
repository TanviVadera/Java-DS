
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Comparator
class Employee
{
    private int id;
    private String name;
    private Double salary;

    public Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public double getSalary()
    {
        return salary;
    }
    @Override
    public String toString()
    {
        return id+" "+name+" "+salary;
    }
}
public class ComparatorDemo
{
    public static void main(String[] args)
    {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(101,"tanvi",5000));
        employees.add(new Employee(102,"shruti",9000));
        employees.add(new Employee(103, "abc", 2000));

        Comparator<Employee> salaryComparator=(e1,e2)->
            Double.compare(e1.getSalary(),e2.getSalary());

        employees.sort(salaryComparator);
        System.out.println("Employees Sorted By Salary:");
        for(Employee e:employees)
        {
            System.out.println(e);
        }

    }
}