package Array;

public class Array3 {
    public static void main(String[] args) {
        int[] x={123,34,56,787,343,787,347,56};
        int[] y={232,35345,23,3543,232,454,67,3};

        int  Max=x[0], MaxY=y[0];
        for(int i=1; i<x.length; i++){
            if(Max < x[i]){
                Max=x[i];
            }
        }
        for(int i=1; i<y.length; i++){
            if(MaxY < y[i]){
                MaxY=y[i];
            }
        }
        if(Max>MaxY){
            System.out.println("The Largest number is "+Max);
        }
        else{
            System.out.println("The Largest number is "+MaxY);
        }
    }
}
