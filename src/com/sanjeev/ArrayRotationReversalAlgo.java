package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */
public class ArrayRotationReversalAlgo{

        public static void arrayRotate(int arr[],int d){
            reverseSubArray(arr,0,d-1);
            reverseSubArray(arr,d,arr.length-1);
            reverseSubArray(arr,0,arr.length-1);
        }

        public static void reverseSubArray(int arr[],int beg,int end){
            int temp;
            while(beg<end){
                temp = arr[beg];
                arr[beg]=arr[end];
                arr[end]=temp;
                beg++; end--;
            }
        }


        /*UTILITY FUNCTIONS*/

        /* function to print an array */
        public  static void  printArray(int arr[]){
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }


        // Driver program to test above functions
        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 5, 6};
            arrayRotate(arr, 2);
            printArray(arr);
            System.out.println("Exit");
        }
}
