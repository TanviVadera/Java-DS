import java.util.*;
class ReverseString{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();

        StringBuilder sb=new StringBuilder(str);

        int left=0;
        int right=sb.length()-1;

        while(left<right)
        {
            char temp=sb.charAt(left);
            sb.setCharAt(left,sb.charAt(right));
            sb.setCharAt(right,temp);

            left++;
            right--;
        }
        System.out.println("Original String: " + str);
        System.out.println("Reverse String: " + sb.toString());
    }
}
