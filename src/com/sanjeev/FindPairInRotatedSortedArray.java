package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
public class FindPairInRotatedSortedArray {

    public static void printPairs(int arr[],int sum){
        int pivot= findPivot(arr,0,arr.length-1);
        System.out.println(pivot);
        if(pivot==-1){
            printPairs(arr,0,arr.length-1,sum);
        }else{
            printPairs(arr,pivot,pivot-1,sum);
        }
    }

    public static  void printPairs(int arr[],int least,int highest,int sum){

        while(least!=highest){
            System.out.println("arr[hig]=" + arr[highest] +"  arr[lest]"+arr[least]);
            if(arr[highest]+arr[least]==sum){
                System.out.println("Pairs  "+arr[highest]+" "+arr[least]);
                return;
            }else if(arr[highest]+arr[least]<sum){
                least++;
                if(least>=arr.length){
                    least = least % arr.length;
                }
            }else{
                highest--;
                if(highest<0){
                    highest = highest + arr.length;
                }
            }
        }

        System.out.println("Not Found");
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


    public static void main(String[] args) {
        int arr[]= {23,34,35,45,64,3,12};
        printPairs(arr,15);
    }
}
