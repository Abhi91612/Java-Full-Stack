import java.util.Scanner;

public class A2Q5 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter Your Income to calculate you income tax");
        Scanner sc =new Scanner(System.in);

        double income =sc.nextDouble();
        if(income <250000)
            System.out.println("No Tax");
        else if(income <500000){
            System.out.println("You will pay 5%  Tax on "+income+" Income");
            double tax=income/20;
            System.out.println("Your Tax Amount is "+tax);
        }
        else if(income <1000000){
            System.out.println("You will pay 5%  Tax on "+income+" Income");
            double tax=income*3/10;
            System.out.println("Your Tax Amount is "+tax);

        }
        else {
            System.out.println("You will pay 5%  Tax on "+income+" Income");
            double tax=income *3/10;
            System.out.println("Your Tax Amount is "+tax);

        }


    }
}
