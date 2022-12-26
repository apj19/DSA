public class Tail_recrusion {
    
    static void print1ton(int n, int k){
        
        if(n==0) return;

        System.out.println(k);
        
         print1ton(n-1, k+1);

    }

    static int factorial(int n, int k){
        if(n==0 || n==1) return k;

        return factorial(n-1, k*n);
    }

    public static void main(String[] args) {
        System.out.println("Tail Recrusion");

        int n=5;
        // print1ton(5, 1);
        System.out.println(factorial(n, 1));
    }
}
