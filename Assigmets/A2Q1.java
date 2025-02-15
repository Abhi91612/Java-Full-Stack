import java.util.Scanner;

public class A2Q1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subject hindi :");
        int hindi=sc.nextInt();
        System.out.println("Enter the number of subject English :");
        int English=sc.nextInt();

        System.out.println("Enter the number of subject Math :");
        int Math=sc.nextInt();
        System.out.println("Enter the number of subject physics :");
        int Physics=sc.nextInt();

        System.out.println("Enter the number of subject chemistry :");
        int chemistry=sc.nextInt();

        double sum=hindi+English+Math+Physics+chemistry;
        double percentage= sum *100/500;
        if(percentage >=85)
        System.out.println("Percentage = "+ percentage+"  Excellent student");
        else if(percentage >=70 )
        System.out.println("Percentage = "+ percentage+"  Very  Good Student");
        else if(percentage >=55)
        System.out.println("Percentage = "+ percentage+"  Good student");
        else if(percentage >=40)
        System.out.println("Percentage = "+ percentage+"  Poor student");
        else 
        System.out.println("Percentage = "+ percentage+"  Very Poor Student");
    }
}
