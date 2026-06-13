//Hashmap

import java.util.*;
class Employee
{
    private int id;
    private String name;
    private int Salary;

    Employee(int id,String name,int Salary)
    {
        this.id=id;
        this.name=name;
        this.Salary=Salary;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getSalary()
    {
        return Salary;
    }
    @Override
    public String toString() 
    {
        return "Employee{" +"id=" + id +", name='" + name + '\'' +", salary=" + Salary +'}';
}
    @Override
    public boolean equals(Object obj)
    {
        if(this==obj)
        {
            return true;
        }
        if(obj==null||getClass()!=obj.getClass())
        {
            return false;
        }
        Employee emp=(Employee)obj;
        return id==emp.id;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
public class HashMapDemo
{
    public static void main(String[] args)
    {
        HashMap<Employee,String> map=new HashMap<>();
        map.put(new Employee(101,"tanvi",5000),"CEO");
        map.put(new Employee(102,"Shruti",4000),"Manager");
        map.put(new Employee(103,"dhruti",4800),"Developer");

        //read
        System.out.println("Employee with 101 id:"+map.get(new Employee(101, "tanvi", 5000)));

        //update
        map.put(new Employee(102,"Shruti",4000),"Clerk");
        System.out.println("After update:");
        System.out.println(map);

        //check if value exist
        System.out.println("Contains Employee 'Rahul'? "+ map.containsValue("Rahul"));

        //Iterate
        System.out.println("----------Employee List--------");
        for(Map.Entry<Employee,String> entry:map.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // Size of HashMap
        System.out.println("\nTotal Employees: " + map.size());
    }
}