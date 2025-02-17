import java.util.Scanner;

public class A2Q5 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter Your Income to calculate you income tax");
        Scanner sc =new Scanner(System.in);
        double tax;

        double income =sc.nextDouble();
        if(income <250000)
            tax=0.0;
        else if(income <500000){
            System.out.println("You will pay 5%  Tax on "+income+" Income");
             tax = (income - 250000) * 0.05;
        }
        else if(income <1000000){
            System.out.println("You will pay 20%  Tax on "+income+" Income");
             tax = 12500 + (income - 500000) * 0.20;

        }
        else {
            System.out.println("You will pay 30%  Tax on "+income+" Income");
            tax = 12500 + 100000 + (income - 1000000) * 0.30;

        }
        System.out.println(tax);


    }
}
