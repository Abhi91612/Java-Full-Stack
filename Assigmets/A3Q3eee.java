public class A3Q3eee {

    public static void findPow(int i,int pow){
        int res=1;
        for(int l=0; l<i; l++){

            res*=pow;
        }
        System.out.print(res+" ");
    }
    public static void main(String[] args) {
        
        for(int i=1; i<6; i++){
            findPow(i,i);

        }
    }
}
