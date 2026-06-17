class StringBufferDemo {
    public static void main(String args[]) {

        StringBuffer sbf = new StringBuffer("Hello");

        System.out.println("Original: " + sbf);

        // append
        sbf.append(" World");
        System.out.println("After append: " + sbf);

        // insert
        sbf.insert(0, "Java ");
        System.out.println("After insert: " + sbf);

        // replace
        sbf.replace(0, 4, "Hi");
        System.out.println("After replace: " + sbf);

        // reverse
        sbf.reverse();
        System.out.println("After reverse: " + sbf);
    }
}
