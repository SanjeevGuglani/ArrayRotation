package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */
public class SortRotatedArray {

    public static void reverseSubArray(int arr[],int beg,int end){
        int temp;
        while(beg<end){
            temp = arr[beg];
            arr[beg]=arr[end];
            arr[end]=temp;
            beg++; end--;
        }
    }

    public static int findPivot(int arr[],int start,int end){
        if(start>end) return  -1;
        int mid = (start + end )/2;
        if(mid<end && arr[mid]>arr[mid+1])
            return mid+1;
        else if(mid>start &&arr[mid-1]>arr[mid])
            return mid;
        else if(arr[start]>arr[mid]){
            return findPivot(arr,start,mid-1);
        }else
            return findPivot(arr,mid+1,end);
    }

    public static void sortArray(int arr[]){
        int pivot=findPivot(arr,0,arr.length-1);
        if(pivot==-1){
            return;
        }
        reverseSubArray(arr,pivot,arr.length-1);
        reverseSubArray(arr,0,pivot-1);
        reverseSubArray(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int arr[]={5,6,7,8,1,2,3,4};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
        int arr2[]={1,2,3,4,5};
        sortArray(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
