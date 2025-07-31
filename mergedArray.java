import java.util.Arrays;

public class mergedArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {1, 4, 6, 8};
        int m = arr1.length;
        int n = arr2.length;
        
        int[] merged = new int[m + n];

        System.arraycopy(arr1, 0, merged, 0, m);
        System.arraycopy(arr2, 0, merged, m, n);


        System.out.println(Arrays.toString(merged));

        cyclicSort(merged);
        System.out.println(Arrays.toString(merged));

                              
    }   

    public static void cyclicSort(int[] arr){
        int i=0; 
        while(i < arr.length){
            int cIdx = arr[i] + 1;
            if(arr[i] != arr[cIdx]){
                swap(arr, i, cIdx);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}