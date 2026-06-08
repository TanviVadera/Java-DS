import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        System.out.println("Initial list:"+list);
        System.out.println("Initial size:"+list.size());

        //add elements
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("\n after adding elements:");
        System.out.println("Initial list:"+list);
        System.out.println("Initial size:"+list.size());

        //insert at specific position
        list.add(1,15);
        System.out.println("After insert element:");
        System.out.println(list);

        //access element
        System.out.println("element at index 2:");
        System.out.println(list.get(2));

        //update element
        list.set(2, 25);
        System.out.println("\nAfter updating index 2 to 25:");
        System.out.println(list);

        //remove element
        list.remove(1);
        System.out.println("\nAfter removing index 1:");
        System.out.println(list);

        //check existence
        System.out.println("Contains:"+list.contains(20));

        //traverse
        System.out.println("\nTraversing list:");
        for(int i=0;i<list.size();i++)
        {
            System.out.println("Index " + i + " -> " + list.get(i));
        }

        //using Arrays.asList()
        List<String> list1=Arrays.asList("monday","tuesday");
        list1.set(0,"MONDAY");  //can not add elements,only modify
        System.out.println(list1);

        //create new arraylist by copying another list
        List<String> newlist1=new ArrayList<>(list1);
        System.out.println(newlist1);

        //List.of()
        List<Integer> list2=List.of(70,80,90);  //can not add,modify
        System.out.println(list2);

        list.addAll(list2);

        list.remove(Integer.valueOf(10)); 
        System.out.println("Remove 10:"+list);

        //ArrayList->Array
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println("Array is:"+Arrays.toString(arr));
    }
}
