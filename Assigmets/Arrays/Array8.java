package Array;

public class Array8 {
    public static void main(String[] args) {
        int[] x={1,2,3,4,5,6,5,4,3,2,1,5,6,7,8,9,8,7,6,5,4,3,2,1};
        int n=x.length;
        boolean [] visite=new boolean[n];
        for(int i=0; i<n; i++){
            if(visite[i]) continue;

            int count =1;
            for(int j=i+1; j<n; j++){
                if(x[i]==x[j]){
                    count++;
                    visite[j]=true;

                }
            }
            System.out.println("Frequency of "+x[i]+" is "+count);
        }

    }
}
