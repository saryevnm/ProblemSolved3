package com.company;

public class Main {

    public static void main(String[] args) {
        //Linear search
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int searchingValue= 5;
        boolean resultOk = false;
        int pos = -1;
        int j = 0;
              // However, the value of arr.length is equal to = 16 = N;
        while (j<arr.length && pos == -1){
            if (arr[j]== searchingValue){
                pos = j;
                resultOk = true;
            }
            j++;
        }
        if (resultOk){
            System.out.println("item found: "+pos);
        }else{
            System.out.println("item not found");
        }

        // Complexity: O(arr.length), O(N);
    }
}

class Binary{

    public static void main(String[] args){
        //Binary search
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int searchingValue= 7;
        boolean resultOk = false;
        int pos = 0;
        int first = 0;
        int last = arr.length - 1;
        int middle = (first+last)/2;
        while (first<=last){
            if (searchingValue == arr[middle]){
                pos = middle;
                resultOk = true;
                break;
            }else if (searchingValue > arr[middle]){
                first = middle+1;
            }else {
                last = middle-1;
            }
            middle = (first+last)/2;
        }
        if (resultOk){
            System.out.println("item found: "+pos);
        }else {
            System.out.println("item not found!");
        }
        //Complexity: O(log arr.length = 4),the maximum count of iteration in the worst-case scenario is 4;
    }
}