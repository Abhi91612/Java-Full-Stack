package Array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        
        int arr[]= {10,20,30,50,10,20,10,30,20};
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int count=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]==input){
                count++;
            }
        }
        System.out.println("The Occurance of "+input+" is "+count);




        sc.close();
    }
    
}
