package com.company.perfect_number;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args){
        StringBuilder resultPrint= new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите начальный диапазон: ");
        int startNum = sc.nextInt();
        System.out.print("Введите конечный диапазон: ");
        int endNum = sc.nextInt();
        //-------------------------------------------------
        //                Algorithm

        for (int i = startNum; i <endNum ; i++) {
            int progress = 0;
            for (int j = i-1; j >0; j--) {
                if (i%j==0){
                    progress = progress + j;
                }
            }
            if (progress==i){
                if (i==endNum-1){
                    resultPrint.append(i);
                }else resultPrint.append(i).append(" ");
            }
        }
        System.out.println(resultPrint);


        // Complexity: O(startNum - endNum)
    }
}
