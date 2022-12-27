public class SumofDigits {
    

    static int sumofDigit(int n){

        if(n<=9) return n;

        return n%10 + sumofDigit(n/10);
    }

    static int sumusingwhile(int n){

        int sum=0;

        while(n > 0){
            sum=sum+n%10;
            n=n/10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of Digit of a number!!!");

        int n=101;
        System.out.println(sumofDigit(n));
        // itrative solution is best hers as it takes constant space
        System.out.println(sumusingwhile(n));
    }
}
