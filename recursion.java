public class recursion{
	
    public static void main(String[] args) {
     int[] arr = {10,20,30};
     int target  = 30;
     int i = 0;
         System.out.println(search(arr, i, target));
    }

       public static  boolean search(int[] arr, int i, int target) {
    // base case: ___________________________
    if(i == arr.length) return false;

    // check current element: _______________
    if(arr[i] == target) return true;

    // recursive call: ______________________
    return  search(arr, i +1, target);
}

}