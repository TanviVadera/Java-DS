public class Fibonacci
{
    public static int Fibo(int n)
    {
       if(n==0)
       {
           return 0;
       }
       if(n==1)
       {
           return 1;
       }
        else
        {
            return Fibo(n-1)+Fibo(n-2);
        }
    }
    public static void main(String args[])
    {
        System.out.println("Fibonacci:=");
        int n = 5;
        for(int i=0;i<=n;i++)
        {
            System.out.print(Fibo(i)+" ");
        }
    }
}
