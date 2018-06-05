package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
public class FindAllRotationDivisibleBy8 {

    public static int rotationDivisibleByEight(Long num) {
        String n = String.valueOf(num);
        int temp;
        int count = 0;
        if (num < 10) {
            return (num == 8) ? 1 : 0;
        } else if (num < 100) {
            temp = (n.charAt(0) - '0') * 10 + (n.charAt(1) - '0');
            if (temp % 8 == 0) {
                count++;
            }
            temp = (n.charAt(1) - '0') * 10 + (n.charAt(0) - '0');
            if (temp % 8 == 0) {
                count++;
            }
        } else {
            for (int i = 0; i < n.length(); i++) {
                int f = (n.charAt(i) - '0') * 100;
                int m = (n.charAt((i + 1) % n.length()) - '0') * 10;
                int e = (n.charAt((i + 2) % n.length()) - '0');
                temp = f + m + e;
                if (temp % 8 == 0) {
                    count++;
                }
            }
        }
        return count;

    }



    public static void main(String[] args) {
        System.out.println("4="+rotationDivisibleByEight(4L));
        System.out.println("8="+rotationDivisibleByEight(8L));
        System.out.println("48="+rotationDivisibleByEight(78L));
        System.out.println("72="+rotationDivisibleByEight(72L));
        System.out.println("98="+rotationDivisibleByEight(88L));
        System.out.println("98="+rotationDivisibleByEight(88L));
        System.out.println("13502="+rotationDivisibleByEight(13502L));
        System.out.println("43262488612="+rotationDivisibleByEight(43262488612L));

    }
}
