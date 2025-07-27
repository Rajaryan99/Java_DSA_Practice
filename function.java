
import java.util.Scanner;

//     public static int sumOfOddNo(int n){
//         int sum = 0;
//         for(int i=1; i<=n; i++){
//             if(i%2 !=0){
//                  sum = sum + i;
//             }
//         }
//         System.out.println("Sum of odd numbers: " + sum);
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n = sc.nextInt();
//         sumOfOddNo(n);

//     }


// }

// Greatest of two number

// public class function {
//     public static int gratestNo(int a, int b){
//         if(a>b) {
//             System.out.println("Greatest number is: " + a );
//             return a;
//         }else {
//             System.out.println("GReatest numbber is : " + b);
//             return b;
//         }
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int A  = sc.nextInt();
//         int B  = sc.nextInt();
//         gratestNo(A, B);
//     }
    

// }

// fibonachi seareis

public class function {
    public static void main(String[] args) {
        int term, a=0, b=1, c;
        Scanner sc = new Scanner(System.in);
        term = sc.nextInt();

        for(int i=1; i<=term; i++){
            System.out.print( a + " ");
            c = a+b;
            a=b;
            b=c;
        }

        
    }
}
