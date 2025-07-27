
import java.util.*;

public class bubbleSort {

    public static void main(String args[]){
        int[] arr = {5, 3, 1, 4, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int getMaxIndex(int[] arr, int start, int last){
        int maxIndex = 0;
        for(int i=0; i<arr.length; i++){
           if(arr[i] > maxIndex){
            maxIndex = arr[i];
           }
        }
        return maxIndex;
    }

    public static void swap(int[] arr, int first, last){
        
    }

    public static void  selection(int[] arr){
        for(int i=0; i<arr.length; i++){
        int last = arr.length - i - 1;
        int maxIdx = getMaxIndex(arr, 0, last);

    }

    public static void bubble(int[] arr){
        int n = arr.length;
        boolean swapped;
        for(int i=0; i<n; i++){
            swapped = false;
            for(int j=1; j<n-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1]; 
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }
    }
}