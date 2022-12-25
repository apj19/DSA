public class TralingzeroinFactorial {
    
    
    static int tZero(int n){
        int res=0;

        for (int i = 5; i <=n; i=i*5) {
          res= res+ n/i ;  
        }

        return res;
    }
    
    public static void main(String[] args) {
        System.out.println("Traling zero running!!!!!!!!");

        int n=100;
        System.out.println(tZero(n));
    }
}
