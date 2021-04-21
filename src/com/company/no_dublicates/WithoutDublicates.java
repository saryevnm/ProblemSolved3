package com.company.no_dublicates;

import java.util.Arrays;

public class WithoutDublicates {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,5,4,52,5,6,5,6,7,77};
        System.out.println(Arrays.toString(getWithoutDublicates(arr)));

    }

    private static int[] getWithoutDublicates(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length ; i++) {
            if (i==arr.length-1){
                stringBuilder.append(arr[i]);
            }else {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i]==arr[j]){
                        break;
                    }else if (j==arr.length-1){
                        stringBuilder.append(arr[i]).append(",");
                    }
                }
            }
        }
        String[] result = stringBuilder.toString().split(",");
        int[] resultInt = new int[result.length];
        for (int i = 0; i < resultInt.length; i++) {
            resultInt[i]=Integer.parseInt(result[i]);
        }
        return resultInt;


        //Complexity: O(arr.length)
    }
}
