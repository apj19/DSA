public class GCD_or_HCF {

    static int gcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }   
    }
    

    public static void main(String[] args) {
        System.out.println("GCD of Two Number Running!!!!!!");

        int a=30;
        int b=15;
        System.out.println(gcd(a, b));
    }

    
}
