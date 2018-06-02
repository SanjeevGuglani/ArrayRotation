/*
package com.sanjeev;

import java.util.Arrays;

*/
/**
 * Created by Sanjeev Guglani
 *//*

public class ArrayRotationBlockSwap {

    public  static  void swap(int arr[],int i,int j,int d){
        int temp;
        for(int k=1;i<=d;k++,i++,j++){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    public static  void leftRotate(int arr[],int start,int end,int d) {
       if((start+d)==(end-(start+d-1)){
           swap(arr,start,end-d+1,d);
        }else if((start+d)<(end-(start+d-1))){
            swap(arr,start,end-d+1,d);
            leftRotate(arr,start,end-d,d);
        }else {
          // swap(start,start+d);
        }
    }

    */
/*UTILITY FUNCTIONS*//*


    */
/* function to print an array *//*

    public  static void  printArray(int arr[]){
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }


    // Driver program to test above functions
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        leftRotate(arr, 0,arr.length-1,1);
        printArray(arr);
    }
}
*/
