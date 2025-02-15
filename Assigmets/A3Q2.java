import java.util.Scanner;

public class A3Q2 {
    public static void main(String[] args) {
        int HCF ,LCM;
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int n1=sc.nextInt();
        System.out.println("enter the Second number");
        int n2=sc.nextInt();
        while (n2!=0) {
            int t=n2;
            n2=n1 % n2;
            n1=t;
        }
        HCF=n1;
        LCM=(n1*n2)/HCF;
        System.out.println("LCM is "+ LCM);

        
        System.out.println("HCF is "+ HCF);


    }
}
