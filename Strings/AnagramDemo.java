class AnagramDemo
{
    public static  void main(String args[])
    {
        String s="listen";
        String t="silent";
        int[] count=new int[26];
        if(s.length()!=t.length())
        {
            System.out.println("The lengths are not equal");
            return;
        }
        else {
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            for (char c : t.toCharArray()) {
                count[c - 'a']--;
            }
            for(int i=0;i<26;i++) {
                if (count[i] != 0) {
                    System.out.println("String is not anagram");
                    return;
                }
            }
        }
        System.out.println("Anagram");
    }
}
