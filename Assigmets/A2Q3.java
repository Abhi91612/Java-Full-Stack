import java.util.Scanner;

public class A2Q3 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in) ;
            System.out.print("Enter Your Age : ");
            int age=sc.nextInt();
            if (age>=18){
                System.out.println("Enter your weight : ");
                int weight=sc.nextInt();
                if (weight >50) {
                    System.out.println("You are eligible to donate blood");
                }else{
                    System.out.println("Your  weight must be  at least 50 kilograms to donate blood");
                }
            }else{
                System.out.println("You must be at  least 18 years old to donate blood");
            }
        }
        
    
}
