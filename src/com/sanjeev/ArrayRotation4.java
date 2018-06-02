package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
// Juggling Algorithm
class ArrayRotation4
{
    /*Function to left rotate arr[] of siz n by d*/
    public static void arrayRotate(int arr[],int d){
        int GCD = GCD(arr.length,d);
        System.out.println(GCD);
        for(int i=0;i<GCD;i++) {
            rotateElementByGCD1234andSoOn(arr,i,d);
        }
    }

    public static  void rotateElementByGCD1234andSoOn(int arr[],int beg,int d){
        int temp=arr[beg];
        int j=beg,k;
        while(true){
            k = j+d;
            if(k>=arr.length){
                k= k%arr.length;
            }
            if(k==beg) break;
            arr[j]=arr[k];
            j=k;
        }
        arr[j]=temp;
    }


    public static int GCD(int a,int b){
        if(a==b)
            return a;
        else if(a>b){
            return GCD(b,a-b);
        }
        return GCD(a,b-a);
    }


    /*UTILITY FUNCTIONS*/

    /* function to print an array */
    public  static void  printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }


    // Driver program to test above functions
    public static void main(String[] args) {
        ArrayRotation4 rotate = new ArrayRotation4();
        int arr[] = {1, 2, 3, 4, 5, 6};
        rotate.arrayRotate(arr, 4);
        rotate.printArray(arr);
    }
}

// T