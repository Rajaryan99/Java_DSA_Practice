public class recursion_level_1{
    public static void main(String[] args) {
      
       reverse(1234);
       System.out.println(sum);
    }


    // =================Reverse a digit====================
   static int sum = 0;
    public static void reverse(int n){
         
        if(n==0){
            return;
        }

        int rem = n%10;
        sum = sum * 10 + rem;
        reverse(n/10);
        
    }

    //==================Sum of digits==================

    public static int sumofDigit(int n){
        if(n<=1){
            return 1;
        }
        return (n%10) + sumofDigit(n/10);
    }

    // =================Sum of numbers===========================
    public static int sum(int n){
        if(n <=1){
            return 1;

        }

        return  n + sum(n-1);
    
    }
    // ================Factorial of a number============================

    public static int fact(int n){
        if(n <=1){
            return 1;

        }

        return  n * fact(n-1);
    
    }

    // ====================Print number till n=======================
    
    public static void print(int n){
        if(n == 0){
            return;
        }
     
       print(n-1);
         System.out.println(n);
    }

    // ================print number in reverse======================
    public static void printRev(int n){
        if(n == 0){
            return;
        }
     
        System.out.println(n);
       printRev(n-1);
    }

}