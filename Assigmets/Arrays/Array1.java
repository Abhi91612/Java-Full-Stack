package Array;

public class Array1 {

    public static void main(String[] args) {
        int arr[]={123,34,516,87,343,787,347,676};
        int n=arr.length;

        for(int i=0; i<n; i++){
            // left is greter than 
            if(i>0 && arr[i]<arr[i-1]){
                System.out.println("The greater adjacent of "+arr[i]+" is "+arr[i-1]);

            }
            //right side number is grater than
            else if(n-1>i && arr[i]<arr[i+1]){
                System.out.println("The  greater adjacent of "+arr[i]+" is "+arr[i+1]);

            }else{
                System.out.println("No adjacent greater than   "+arr[i]+" ");

            }
            
        }
    }
}