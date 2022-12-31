
public class GenerateSubsetofString {
    

    
    static void subsetofstring(String str, String curr, int i){

        if(i== str.length()){
            System.out.println(curr);
            return;
        }

        subsetofstring(str, curr, i+1);
        subsetofstring(str, curr+ str.charAt(i), i+1);

    }
    
    public static void main(String[] args) {
        System.out.println("Geneerate subset of string");
        int i=0;
        String curr="";

        String str="ABC";
    
        subsetofstring(str, curr, i);
        
    }

   
}
