/**
 * TowerofHanoi
 */
public class TowerofHanoi {

    
    static void toh(int n, char start, char middle, char end){

        if(n==1){
            System.out.println("Move 1 from "+start+" to "+end);
            return;
        }

        toh(n-1, start, end, middle);
        System.out.println("Move "+n+" from "+start+" to "+end);
        toh(n-1, middle, start, end);
    }
    
    public static void main(String[] args) {
        System.out.println("Tower of Hanoi");

        char start='A';
        char middle='B';
        char end='C';
        int n=3;

        toh(n, start, middle, end);
    }
}