package project1;

public class task3 {
    /*Createa2Darrayorintegertypewhereyouwillstoreoddandevennumbers.Developaprogramwhichwillidentify/printtheevennumbersonly.*/
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 4, 2},
                {5, 7, 8, 9, 10},
                {25, 56, 89, 98, 888}
        };


        for (int[] num : numbers) {
            for (int i : num) {
                if(i%2==0){
                    System.out.print( i+" ");
                }
            }
            System.out.println();
        }
        }
    }


