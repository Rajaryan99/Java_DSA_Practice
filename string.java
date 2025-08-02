import java.util.Arrays;

public class string {
    public static void main(String args[]){
        String s = "hello";
       
      int left = 0;
        int right = s.length -1;
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            right--;
            left++;
        }

        System.out.println(s);
   
    }

    public static void reverse(String s){
        int left = 0;
        int right = s.length() -1;
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            right--;
            left++;
        }
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
