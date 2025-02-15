public class A1Q5 {
    public static void main(String [] args){
        int var1=1, var2=2, var3=3, var4=4;
        int temp = var4;
        var4=var3;
        var3=var2;
        var2=var1;
        var1=temp;
        System.out.println("var1 = "+var1);
        System.out.println("var2 = "+var2);
        System.out.println("var3 = "+var3);
        System.out.println("var4 = "+var4);

    }
}
