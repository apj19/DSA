public class Print1toN {


    static void print(int n){
        if(n==0) return;

        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        System.out.println("Print from 1 to n");

        int n=3;

        print(n);
    }
    
}
