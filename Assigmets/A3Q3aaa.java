public class A3Q3aaa {
    public static void main(String[] args) {
        int n=10; int prev=0 , curr=1;
        
        for(int i=1; i<=n; i++){
            System.out.print(" "+curr+" ");
            int next=prev+curr;
            prev=curr;
            curr=next;

            


        }
    }
}
