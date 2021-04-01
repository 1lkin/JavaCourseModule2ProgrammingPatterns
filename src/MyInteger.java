/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */

/**
 * IKIN HASANOV's response to Homework [x], Module [x].
 *
 *   Task:
 *
 *
 * @version 1.10
 * @Since [DD] [MMM] [YYYY]
 * @class
 * @author Ilkin Hasanov
 */
public class MyInteger {
    public static void main(String[] args) {
        int a = 113;
        System.out.println(isPrime(a));
    }
    public static boolean isPrime(int num){
        boolean a = true;
        for (int i = 2; i < num ; i++) {
            if (num % i == 0) {
                a = false;
            }
        }
        return a;
    }
}
