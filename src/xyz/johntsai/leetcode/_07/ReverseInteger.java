package xyz.johntsai.leetcode._07;

/**
 * Created by JohnTsai on 16/6/26.
 */
public class ReverseInteger {
    public int reverse(int x){
        int result = 0;
        while(x!=0){
            if(result>Integer.MAX_VALUE/10||result<Integer.MIN_VALUE/10){
                return 0;
            }
            result = result*10+x%10;
            x=x/10;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 1000000003;
        ReverseInteger reverseInteger = new ReverseInteger();
        final int reverse = reverseInteger.reverse(a);
        System.out.println(reverse);

    }
}
