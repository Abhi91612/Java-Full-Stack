import java.util.Scanner;

public class A2Q2 {
    public static void main(String[] args) {
        int large;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1= sc.nextInt();
        System.out.println("enter second number : ");
        int n2= sc.nextInt();
        System.out.println("enter third number : ");
        int n3= sc.nextInt();
        System.out.println("enter Fourth number : ");
        int n4= sc.nextInt();
        
        if(n1<n2)
            large=n2;
        else large=n1;

        if(large<n3)
            large=n3;
        if(large<n4)
            large=n4;

        System.out.println("Largest number is "+large);


        
    }
    
}
