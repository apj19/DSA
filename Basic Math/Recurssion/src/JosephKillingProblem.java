public class JosephKillingProblem {
    
    

    static int joe(int n, int k){
        if(n==1) {
            return 0;
        }else{
            return ( joe(n-1,k)+k )%n ;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Joseph person killing probem ");

        System.out.println(joe(5, 3));
    }


}
