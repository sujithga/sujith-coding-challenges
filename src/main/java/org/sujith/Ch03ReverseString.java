package org.sujith;

public class Ch03ReverseString {
    public static void main(String[] args){
        System.out.println(reverseWithStringBuilder("Hello there"));
        System.out.println(reverseWithoutReverseMethod("Good Morning"));

    }

    static String reverseWithStringBuilder(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    static String reverseWithoutReverseMethod(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--){
            sb.append(str.charAt(i));
        }
        return sb.reverse().toString();
    }


}
