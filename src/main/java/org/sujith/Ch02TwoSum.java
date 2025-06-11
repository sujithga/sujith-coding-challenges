package org.sujith;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ch02TwoSum {

    public static void main(String[] args){
        int[] input =  {1,2,3,4,5,6};
        System.out.println(Arrays.toString(getIndex(input,8)));


    }

    static int[] getIndex(int[] input, int target){
        Map<Integer,Integer> visitedNumber = new HashMap<>();
        for(int i =0 ;i < input.length; i++){
            int delta = target - input[i];
            if(visitedNumber.containsKey(delta)) {
                return new int[] {visitedNumber.get(delta),i};
            } else {
                visitedNumber.put(input[i], i);
            }
        }
        return new int[]{-1,-1};
    }
}
