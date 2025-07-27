public class returnTheLastAndFirstIndex {

    public static int b_search(int[] arr, int target ){

        int start = 0;
        int end = arr.length -1; 

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

    

        while(end >= start){
            int mid  = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        System.out.println("hello world");

        int[] arr = {5,7,7,8,8,10};
        int target = 8;

        for(int i=0; i<arr.length; i++){
            System.out.println(i + " "+"=" +" "+ arr[i]);
        }

        int ans = b_search(arr, target);
        System.out.println(ans);

    }

}