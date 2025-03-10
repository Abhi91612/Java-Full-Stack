package Array;

public class Array5 {

    public  static boolean isPrime(int x){
        for(int i=2; i*i<=x; i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    } 
    public static void main(String[] args) {
        
        int[] x={123,34,56,787,343,717,347,56,17,79};
        
        for(int i=0; i<x.length; i++){
            if(isPrime(x[i])){
                System.out.println(x[i]+" ");
            }
            
        
            }
        }
    }

