package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */

//This method is used to serarch an element in rotated sorted Array Where Duplicates are not present
public class BinarySerchOnRotatedArray {

    public static  int binarySearch(int arr[],int start,int end,int item){
        if(start>end){
            return  -1;
        }
        int mid = (start+end)/2;

        if(arr[mid]==item){
            return mid;
        }else if(arr[mid]>item){
            return binarySearch(arr,start,mid-1,item);
        }else {
            return binarySearch(arr,mid+1,end,item);
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

    public static int searchInRotatedArray(int arr[],int item){
        int pivot=findPivot(arr,0,arr.length-1);
        if(pivot==-1){
           return binarySearch(arr,0,arr.length,item);
        }
        if(arr[pivot]==item){
            return pivot;
        }
        if(arr[pivot]<item && arr[arr.length-1]>=item){
            return binarySearch(arr,pivot,arr.length-1,item);
        }else{
           return binarySearch(arr,0,pivot-1,item);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(searchInRotatedArray(arr,4));
    }
}
