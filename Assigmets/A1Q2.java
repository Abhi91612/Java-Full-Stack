public class A1Q2 {

    public static double ConvertToDollar(int rs){

        double Dollar=  (double)rs/87;
        return Dollar;
    }
    
    public static void main(String[] args) {
        int IndianRs=100;
        double Dollar=ConvertToDollar(IndianRs);
        System.out.println(Dollar);
    }
}
