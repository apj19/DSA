public class factorial {

    static int fact(int n){
        
        // base case
        if(n==0) return 1;
        
        //work
        return n*fact(n-1); 
    }
    
    public static void main(String[] args) {
        System.out.println("Factorial running");
        int n=5;

        System.out.println(fact(n));
    }
}
