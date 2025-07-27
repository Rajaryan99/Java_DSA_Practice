import java.util.*;

// public class array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of array: ");
//         int size = sc.nextInt();
//         int[] numbers = new int[size];

//         System.out.println("Input arrys: ");
//         for(int i=0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }

//         System.out.print(" Enter the value x: ");
//         int x = sc.nextInt();

//         for(int i=0; i<numbers.length; i++) {
//             if(numbers[i] == x){
//                 System.out.print("X found at index " + i);
//             } 
//         }

//     }
// }

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size  = sc.nextInt();
        
        int[] number = new int[size];   

        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++) {
            if(number[i] < min){
                min = number[i];
            }

            if(number[i] > max) {
                max = number[i];
            }
        }

        System.out.println("Largest number : " + max);
        System.out.println("smallest number : " + min);
     }
}