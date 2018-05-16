package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
public class ArrayRotation {

    /**
     * Rotate array.
     *
     * @param arr the arr
     * @param d   the d
     */
    public static void rotateArray(int arr[],int d){
        int tempArray[] = new int[d];

        //Save in temporary Array first d digits
        for(int i=0;i<d;i++){
            tempArray[i]=arr[i];
        }

        //Shift array to d digits
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }

        //Place Temp Array to last
        for(int i=arr.length-1,l=tempArray.length-1;i>=0&&l>=0;i--,l--){
            arr[i]=tempArray[l];
        }
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
       int arr[]= new int[]{1,2,3,4,5};
       rotateArray(arr,2);
       printArray(arr);
    }
}
