package xyz.johntsai.leetcode._342;

/**
 * Created by JohnTsai on 16/7/1.
 */
public class PowerOfFour {
    /**
     * 1,4,16,64...
     * @param num
     * @return
     */
    public boolean isPowerOfFour(int num){
        if(num<=0) return false;
        while (num%4==0){
            num/=4;
        }
        return num==1;
    }

    public static void main(String[] args) {
        PowerOfFour powerOfFour = new PowerOfFour();
        System.out.println(powerOfFour.isPowerOfFour(16));
        System.out.println(powerOfFour.isPowerOfFour(-2147483648));
    }
}
