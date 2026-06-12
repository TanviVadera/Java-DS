//vector
import java.util.Vector;

class Mytask implements Runnable
{
    private Vector<Integer> vector;
    public Mytask(Vector<Integer> vector)
    {
        this.vector=vector;
    }
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            vector.add(i);
            System.out.println(Thread.currentThread().getName()+"added"+i);

            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class VectorDemo
{
    public static void main(String[] args)
    {
        Vector<Integer> vector = new Vector<>();

        Mytask task=new Mytask(vector);

        Thread t1=new Thread(task,"thread-1");
        Thread t2=new Thread(task,"thread-2");

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) 
        {
            System.out.println(e.getMessage());
        }

        System.out.println("\nFinal Vector Elements: " + vector);
    }
}