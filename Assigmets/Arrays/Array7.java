package Array;

public class Array7 {

    public static boolean isPresent(int d, int [] arr){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==d) return true;

        }
        return false;
    }
    public static void main(String[] args) {
        int[] x={11,5,67,23,49,90,45};
        int[] y={45,19,11,67,567,2,5};
        for(int i=0; i<x.length; i++){
            if(!isPresent(x[i],y)){
                System.out.print(x[i]+" ");
            }
    }
}
}
