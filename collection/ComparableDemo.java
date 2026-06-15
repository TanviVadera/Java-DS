import java.util.ArrayList;
import java.util.List;

public class ComparableDemo implements  Comparable<ComparableDemo>
{
    private int id;
    private String name;
    private double price;

    public ComparableDemo(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId()
    {
        return id;
    }
    public String  getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    //Natural Sorting
    @Override
    public int  compareTo(ComparableDemo p)
    {
        return Double.compare(this.price, p.getPrice());
    }
    @Override
    public String toString()
    {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
    }
     public static void main(String[] args)
     {
         List<ComparableDemo> comparableDemos = new ArrayList<ComparableDemo>();
         comparableDemos.add(new ComparableDemo(1, "Apple", 100.00));
         comparableDemos.add(new ComparableDemo(2, "Banana", 120.00));
         comparableDemos.add(new ComparableDemo(3, "Orange", 150.00));

         System.out.println("Before sorting:");
         for(ComparableDemo p : comparableDemos)
         {
             System.out.println(p);
         }
         comparableDemos.sort(null);
         System.out.println("After sorting:");
         for(ComparableDemo p : comparableDemos)
         {
             System.out.println(p);
         }
     }
}

