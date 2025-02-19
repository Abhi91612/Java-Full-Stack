public class characterPattern {
    public static void main(String[] args) {
        int n=6; 
        for(char i=65; i<=65+n; i++){
            for(char j=65; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
