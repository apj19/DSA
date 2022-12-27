public class Palindrome {
    

    
    static boolean palindrome(String str, int start, int end){

        if(start>=end) return true;

        return( (str.charAt(start)== str.charAt(end))&&(palindrome(str, start+1, end-1)));
    }
    
    
    public static void main(String[] args) {
       System.out.println("Palindrome Using Recrusion");

       String str= "a";
       int start= 0;
       int end = str.length() -1;

       System.out.println(palindrome(str, start, end));

    }
}
