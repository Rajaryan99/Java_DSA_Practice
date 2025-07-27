public class findInInfiniteArry {
    public static void main(String args[]){
        int[] arr = {12, 14, 17, 20, 26, 33, 44, 52, 69, 100};
        int target = 69;
       int ans = findRange(arr, target);
       System.out.println(ans + " " + "=" + " " + arr[ans] );
    }


     static int findRange(int[] arr, int target){

        int start = 0;
        int end  = 1;

        while(target > arr[end]){
            int newStart = end +1;

            end  = end *2;
            start = newStart;
        }
        return search(arr, target, start, end);

        
    }

    public static int search(int[] arr, int target, int start, int end){
             while(start <= end){
            int mid  = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return  -1;
    }
}
