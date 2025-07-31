public class string {
    public static void main(String args[]){
       
        String s = "null";
        System.out.println(isPalindrom(s));
   
    }

    public static boolean isPalindrom(String str){

        str.toLowerCase();
        for(int i=0; i<str.length() /2; i++){
        char start = str.charAt(i);
        char end = str.charAt(str.length() - 1 - i);

        if(start !=  end){
            return false;
        }
        }
        return true;
    }
}
