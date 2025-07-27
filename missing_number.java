public class missing_number {
    public static void main(String[] args) {
        int [] arr = {3, 0, 1};
        missingNumber(arr);
    }

    public static void missingNumber(int[] arr){
       int i=0; 
       while(i < arr.length){
        int correctIdx = arr[i];
        if(arr[i] < arr.length && arr[i] != arr[correctIdx]){
            swap(arr, i, correctIdx);
        } else{
            i++;
        }

       }

       for(int idx = 0; i<arr.length; idx++){
            if(arr[idx] != idx){
                System.out.println(idx);
            } else {
                System.out.println(arr.length);
            }
       }

    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}