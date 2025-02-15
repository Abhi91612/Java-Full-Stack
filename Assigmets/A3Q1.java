import java.util.Scanner;

public class A3Q1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number which you to factor of : ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+"  ");
            }
        }

    }
}
