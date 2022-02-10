package jp.co.datastructure;
public class Practice {

    public boolean isPalindrome(String s) {
       s= s.replaceAll("[^a-zA-Z]", "");
        s.toLowerCase();
        String  reverseStr = "";

        int strLength = s.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + s.charAt(i);
        }
        if(s.equals(reverseStr))
            return  true;
        else return false;
    }
        // Print keys and values

    public static void main(String[] args) {

        System.out.println("Hellow world");

    }
}
