public class A1Q1 {
    public static void printAddition(int x , int y){
        int z=x+y;
        System.out.println("Addition of "+x +" and "+y+" = "+z);
    }


    public static void printSubtraction(int x , int y){
        int z=x-y;
        System.out.println("Subtract  "+y +" from "+x+" = "+ z);
    }

    public static void printMultiplication(int x , int y){
        int z=x*y;
        System.out.println("Multiplication of "+x +" and "+y+" = "+z);
    }
    
    public static void printDivision(int x , int y){
        int z=x/y;
        System.out.println(" Divide "+x +" by "+y+" = "+z);
    }

    public static void main(String[] args) {
        int x=100 , y=10;
        printAddition(x,y);
        printSubtraction(x,y);
        printMultiplication(x,y);
        printDivision(x,y);
    }
}