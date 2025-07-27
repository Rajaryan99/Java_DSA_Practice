public class loops {
    public static void main(String args[]) {
        for(int i=0; i<+11; i++) {
            System.out.println(i);
        }
        //System.out.println();
    }
}
//sloid Rectangle
// public class loops  {
//     public static void main(String args[]){
//         int n=5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n;j++){
//                 System.out.print("* ");
//             }
//             System.out.println(); // Move to the next line after printing stars for each row
//         }
//     }
// }


// // Hollow Rectangle
// public class loops{
//     public static void main(String[] args) {
//         int n=4;
//         int m=5;

//         //ourter loop
//         for(int i=1; i<=n; i++){
            
//             //inner loop
//             for(int j=1; j<=m; j++){
//                 //condition for printing stars
//                 if(i==1 || i==n || j==1 || j==m) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }


// // half pyramid

// public class loops {
//     public static void main(String[] args) {
//         int n=5;
//         //outer loop

//         for(int i=1; i<=n; i++){
             
//             //inner loop
//             for(int j=1; j<=i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// inverted half pyramid

// public class loops {
//     public static void main(String[] args) {
//         int n=5;
//         //outer loop
//         for(int i=n; i>=1; i--){

//             //inner loop 
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Roated half pyramid

// public class loops {
//     public static void main(String[] args) {
//         int n = 5;
//         //outer loop
//         for (int i=1; i<=n; i++) {

//             //inner loop for spaces
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }

//             //inner loop for stars
//             for (int j=1; j<=i; j++ ){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class loops {
//     public static void main(String args[]){
//         int n=5; 
//         int count =1;
//             //outer loop 
//             for(int i=1; i<=n; i++) {
//                 //inner loop
//                 for (int j=1; j<=i;j++) {
//                     System.out.print(count + " ");
//                     count++;
//                 }
//                 System.out.println();
//             }
//         }
//     }


// butterfky pattern

// public class loops {
//     public static void main(String args[]){

//         int n=4;

//         //upper half
//         for(int i =1; i<=n; i++) {

//             //firat hakf ster
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }

//             //spaces
//             int space = 2 * (n-i);
//             for(int j=1; j<=space; j++) {
//                 System.out.print(" ");
//             }

//             //second half
//             for(int j=1; j<=i; j++) {
//               System.out.print("*");
//             }
//             System.out.println();

//         }
        
        
//         //Lower half
//         for(int i =4; i>=1; i--) {

//             //firat hakf ster
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }

//             //spaces
//             int space = 2 * (n-i); // logic of the pattern
//             for(int j=1; j<=space; j++) {
//                 System.out.print(" ");
//             }

//             //second half
//             for(int j=1; j<=i; j++) {
//               System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }

//solid rombus
// public class loops {
//     public static void main(String[] args) {
//         int n=5;

//         //outer loop
//         for(int i=1; i<=n; i++) {

//             // print spaces 
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }

//             //print stars
//             for(int j=1; j<=n; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// //Number pyramid
// public class loops {
//     public static void main(String[] args) {
//         int n=5;

//         //outer loop
//         for(int i=1; i<=n; i++) {

//             //print spaces
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }

//             //print numbers
//             for(int j=1; j<=i; j++) {
//                 System.out.print(i  + " ");
//             }
//             System.out.println();
//         }
//     }
// }

public class loops {
    public static void main(String[] args) {
        int n=5;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }

            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}