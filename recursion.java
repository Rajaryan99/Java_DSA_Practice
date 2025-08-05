import java.util.ArrayList;
import java.util.List;

public class recursion{
	
    public static void main(String[] args) {
     int[] arr = {10,20,30, 30, 50, 30};
     int target  = 30;
     int i = 0;
         System.out.println(findAllIndexes(arr, i, target));
    }

       public static  int search(int[] arr, int i, int target) {
    // base case: ___________________________
    if(i == arr.length) return -1;

    // check current element: _______________
    if(arr[i] == target) return i;

    // recursive call: ______________________
    return  search(arr, i +1, target);
}

static List<Integer> findAllIndexes(int[] arr, int i, int target) {
    // base case
    if (i == arr.length) return new ArrayList<>();

    // recursive call
    List<Integer> ans = findAllIndexes(arr, i + 1, target);

    // check and add current index
    if (arr[i] == target) {
        ans.add(0, i); // or use add(i) and reverse later
    }

    return ans;
}

}