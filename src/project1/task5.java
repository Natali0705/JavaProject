package project1;
/*
Write a program to swap 2 numbers without a temporary variable?
 */
public class task5 {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("y="+y);
        System.out.println("x="+x);
    }

}
