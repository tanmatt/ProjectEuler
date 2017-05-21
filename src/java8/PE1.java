package java8;

import java.util.Scanner;

/**
 * Created by Tanmay on 5/20/2017.
 *
 * Project Euler #1: Multiples of 3 and 5
 *
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler001
 */
public class PE1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputs = scan.nextInt();

        for (int i = 0; i < inputs; i++) {
            int threshold = scan.nextInt();
            System.out.println(getSum(threshold));
        }
    }

    static long getSum(int threshold) {
        long sum = 0;
        threshold --;

        if (threshold < 3) {
            return sum;
        }

        long sumOfThrees = 3 * sumAP(threshold / 3);
        long sumOfFives = 5 * sumAP(threshold / 5);
        long sumOfFifteens = 15 * sumAP(threshold / 15);

        return sumOfThrees + sumOfFives - sumOfFifteens;
    }

    private static long sumAP(long input) {
        return input * (input + 1) / 2;
    }
}
