public class Print_Triangle {
    public static void main(String[] args) {
        System.out.println("\nTriangle : ");
        System.out.println();
        printTriangle(5);
        System.out.println("\nInverted Triangle : ");
        System.out.println();
        printInvertedTriangle(5);
    }

    static void printTriangle(int n){
        if(n==0){
            return;
        }
        printTriangle(n-1);
        helper(n);
        System.out.println();
        
    }
    static void printInvertedTriangle(int n){
        if(n==0){
            return;
        }
        helper(n);
        System.out.println();
        printInvertedTriangle(n-1);
    }

    static void helper(int number){
        for(int i=0;i<number;i++){
            System.out.print("* ");
        }
    }
}
