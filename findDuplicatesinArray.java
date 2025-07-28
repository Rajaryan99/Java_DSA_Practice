import java.util.ArrayList;
import java.util.List;

public class findDuplicatesinArray {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1} ;
       List<Integer> duplicates = findDuplicates(arr);
       System.out.println(duplicates);

    }
     public static List<Integer> findDuplicates(int[] arr) {
        
          int i=0;
        while(i < arr.length){
            int correctIdx = arr[i]-1;
            if(arr[i] != arr[correctIdx]){
                swap(arr, i, correctIdx);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                ans.add(arr[j]);
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    
}
