/*
 * Tianlang Qin
 * hw009 hw010
 * worked with no one 
 * advised by Jinyu Zheng
 */

public class IntAndDouble {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(13));
    }

    static int sum(int n) {
        return n * (n + 1) / 2; 
    }

    static int fibonacci(double index) {
        /*
            () parentheses
            Math.pow member access
            (int) cast
            * multiplicative
            + - additive/subtractive
        */
        double sqrt_5 = Math.sqrt(5);
        return (int) ((Math.pow(1 + sqrt_5, index) - Math.pow(1 - sqrt_5, index)) / (Math.pow(2, index) * sqrt_5));
    }
}