package Array;

public class Array9 {
    public static boolean isContain1(int d, int n){
        while (d!=0) {
            int last=d%10;
            if(last==1) return true;
            d=d/10;

        }
        return false;
    } 
    public static void main(String[] args) {
        int[] x={123,34,56,787,343,717,347,56,17,79,61};
        int n=x.length;
        for(int i=0; i<n; i++){
            if (isContain1(x[i],n)) {
                System.out.print(x[i]+" ");
            }
        }

    }
}
