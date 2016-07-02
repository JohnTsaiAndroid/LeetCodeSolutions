package xyz.johntsai.leetcode._371;

/**
 * Created by JohnTsai on 16/7/2.
 */
public class SumofTwoIntegers {
    public int getSum(int a, int b) {
        while (b != 0) {
            int c = a & b; //carry
            a ^= b; //add
            b = c << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        SumofTwoIntegers sumofTwoIntegers = new SumofTwoIntegers();
        final int sum = sumofTwoIntegers.getSum(11, 22);
        System.out.println(sum);
    }
}
