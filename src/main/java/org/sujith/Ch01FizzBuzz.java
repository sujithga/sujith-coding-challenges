package org.sujith;

public class Ch01FizzBuzz {

    public static void main(String[] args){
        print(100);
    }

    private static void print(int limit) {
        for (int i =1 ; i <= limit ; i++){

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 ){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }


        }

    }
}
