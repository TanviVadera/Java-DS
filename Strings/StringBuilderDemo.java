class StringBuilderDemo
{
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println("Original String:"+sb);

        //append
        sb.append("world");
        System.out.println("After append="+sb);

        //insert
        sb.insert(0,'a');
        System.out.println("After insert="+sb);

        //replace
        sb.replace(0,4,"hi");
        System.out.println("After replace="+sb);

        //reverse
        sb.reverse();
        System.out.println("After reverse="+sb);
    }
}
