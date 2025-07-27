import java.util.Arrays;

public class insertionSort{

    public static void main(String[] args) {
        int[] arr = {5,2,4,1,3};
        System.out.println(Arrays.toString(insertionSort(arr)));
        
    }

    public static int[] insertionSort(int[] arr){

        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
            arr[j+1] = arr[j];
            j--;
            }
            arr[j+1] = temp;
        }
     return arr; 
    }
}