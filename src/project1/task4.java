package project1;

import java.sql.SQLOutput;

/*
Createa2Darrayofintegers.Developaprogramwhichwillcalculatethesumofevenandoddnumbersforthatarray.
 */
public class task4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 23, 4, 2},
                {5, 7, 8, 9, 3},
                {25, 56, 89, 98, 888}
        };

        int oddNum = 0;
        int evenSum = 0;

        for (int[] num : numbers) {
            for (int i : num) {
                if (i % 2 == 0) {
                    evenSum += i;}
                if(i%2!=0){
                    oddNum+=i;}
                }

                }

            System.out.print("The sum of even numbers is " + evenSum);
        System.out.println();
            System.out.print("The sum of odd numbers is " + oddNum);

            }
        }




