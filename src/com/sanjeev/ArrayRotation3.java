package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */


//THIS METHOD ONLY WORKS IF array length is divisible by D. 
public class ArrayRotation3 {

    public static void arrayRotate(int arr[],int d){
        for(int i=0;i<d;i++) {
            rotateElementSetBySet(arr,i,d);
            //printArray(arr);
            System.out.println();
        }
    }

    public static void rotateElementSetBySet(int arr[],int begining,int gcd){
        int temp = arr[begining];
        int i;
        for(i=begining+gcd;i<arr.length;i=i+gcd){
            arr[i-gcd]=arr[i];
        }
        arr[i-gcd]=temp;
    }

    public static void  printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,4,5,6};
        arrayRotate(arr,6);
        printArray(arr);
    }

}
