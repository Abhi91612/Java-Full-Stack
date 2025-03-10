package Array;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int []arr={10,3,5,6,20};
        Arrays.sort(arr);
        int n=arr.length;
        System.out.println("Multiplication of "+arr[n-1]+","+arr[n-2]+","+arr[n-3]+" is "+arr[n-1]*arr[n-2]*arr[n-3]);
    }
}
