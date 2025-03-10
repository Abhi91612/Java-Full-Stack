package Array;

public class Array4 {
    public static void main(String[] args) {
        int []x={123,34,56,787,343,717,347,56};
        // assume for only positive intger
        int first=Integer.MIN_VALUE;
        
        int second=Integer.MIN_VALUE;
        for(int num:x){
            if(num>first){
                second=first;
                first=num;

            }
            else if(num>second && num!=first){
                second=num;
            }
            
        }
        System.out.println("Second largest number in the array is "+second);
    }
}
