package project1;

import java.util.Scanner;

public class task6 {
    static boolean isPrime(int n) {

        if (n <= 1) return false;


        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if (isPrime(11)) {
            System.out.println("The number is prime");
        }
        else {
            System.out.println("The number is not prime");
        }
    }

}
