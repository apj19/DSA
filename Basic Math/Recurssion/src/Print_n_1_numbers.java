public class Print_n_1_numbers {
    

static void printNto1(int n){
    if(n==0) return;

    System.out.println(n);

    printNto1(n-1);
}



    public static void main(String[] args) {
        System.out.println("Print n to 1 numbers");

        int n=3;

        printNto1(n);
    }
}
