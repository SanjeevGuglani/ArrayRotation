package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
//Juggling Algorithm
class ArrayRotation4
{
    /*Function to left rotate arr[] of siz n by d*/
    void leftRotate(int arr[], int d, int n)
    {
        int i, j, k, temp;
        int g= gcd(d, n);
        System.out.println(g);
        for (i = 0; i < gcd(d, n); i++)
        {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true)
            {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
                System.out.println("Inner :");
                printArray(arr);
            }
            arr[j] = temp;
            System.out.println("Outer :");
             printArray(arr);
        }
    }

    /*UTILITY FUNCTIONS*/

    /* function to print an array */
    public  void  printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    /*Fuction to get gcd of a and b*/
    int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        ArrayRotation4 rotate = new ArrayRotation4();
        int arr[] = {1, 2, 3, 4, 5, 6};
        rotate.leftRotate(arr, 4, 6);
        rotate.printArray(arr);
    }
}

// T