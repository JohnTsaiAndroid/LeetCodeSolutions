package xyz.johntsai.leetcode._13;

/**
 * Created by JohnTsai on 16/6/25.
 */
public class RomanToInteger {
    /**
     * 参考链接:
     * 1.https://zh.wikipedia.org/wiki/%E7%BD%97%E9%A9%AC%E6%95%B0%E5%AD%97
     * 2.http://literacy.kent.edu/Minigrants/Cinci/romanchart.htm
     * @param s
     * @return
     *
     * 罗马数字:
     *      1.有7个字母 I（1）、V（5）、X（10）、L（50）、C（100）、D（500）和M（1000）
     *      2.没有0,与进位制无关
     *      3.重复数次,一个罗马数字重复几次,就表示这个数的几倍
     *      4.右加左减
     *        4.1较大的罗马数字右边有较小的罗马数字,表示大数字加小数字
     *        4.2较大的罗马数字左边有较小的罗马数字,表示大数字减小数字
     *        4.3左减的数字有限制,仅限于I,X,C 1,10,100
     *        4.4左减不可跨越一个位值 99=100-10+10-1
     *        4.左减的数字必须是一位
     *        4.5右加的数字不可连续超过3位
     *
     *                     result    val
     *        MCMXCVI
     *   0                   1000   1000
     *   1                   1100    100
     *   2                   1900   1000
     *   3                   1910     10
     *   4                   1990    100
     *   5                   1995      5
     *   6                   1996      1
     */
    public int romanToInt(String s){
       char [] romanChars = s.toCharArray();
       int result,pre,cur;
       result = romanCharToInt(romanChars[0]);
       for(int i = 1;i<romanChars.length;i++){
           pre = romanCharToInt(romanChars[i-1]);
           cur = romanCharToInt(romanChars[i]);
           if(cur<=pre){
               result+=cur;
           }else{
               result = result-pre*2+cur;
           }
       }
       return result;
    }
    public int romanCharToInt(char c){
       if(c=='I'){
           return 1;
       }else if(c=='V'){
           return 5;
       }else if(c=='X'){
           return 10;
       }else if(c=='L'){
           return 50;
       }else if(c=='C'){
           return 100;
       }else if(c=='D'){
           return 500;
       }else if(c=='M'){
           return 1000;
       }else{
           return 0;
       }
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        final int dcxxi = romanToInteger.romanToInt("MCMXCVI");
        System.out.println(dcxxi);
    }
}
