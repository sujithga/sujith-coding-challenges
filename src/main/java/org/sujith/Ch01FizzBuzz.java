package org.sujith;

public class Ch01FizzBuzz {

    public static void main(String[] args){

    }

    private static void print(int limit) {
        for (int i =1 ; i <= limit ; i++){

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }

        }

    }
}
