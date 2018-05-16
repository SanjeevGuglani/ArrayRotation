package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
public class ArrayRotation1 {

    /**
     * Rotate array.
     *
     * @param arr the arr
     * @param d   the d
     */
    public static void rotateArray(int arr[],int d){
        for(int i=1;i<=d;i++){
            rotateArrayByOne(arr);
        }
    }


    /**
     * Rotate array by one.
     *
     * @param arr the arr
     */
    public static void rotateArrayByOne(int arr[]){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }

    /**
     * Print array.
     *
     * @param arr the arr
     */
    public static void  printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,4,5,6};
        rotateArray(arr,2);
        printArray(arr);
    }
}
