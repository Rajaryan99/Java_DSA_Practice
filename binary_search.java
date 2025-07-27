public class binary_search {
  public static int binarySearchMethod(int arr[], int target) {

    int start = 0;
    int end  = arr.length-1;

    for(int i=0; i<arr.length; i++){
      // finding the middle element
        int mid = start + (end - start) / 2;

        // if the arr is in desending order
      if(arr[0] > arr[arr.length-1]){
       
            if(target > arr[mid]){

              end = mid-1;

            } else if(target < arr[mid]){

                start = mid +1;

            } else {

                return mid;
            }
      
    } else{  // if the arr is in assending order
             if(target > arr[mid]){
            start = mid +1;

        } else if(target < arr[mid]){
            end = mid - 1;

        } else {
            //target found
            return mid;
        }
    }
    }
    // return -1 if not found
    return -1;
  }



  public static void main(String args[]){
// index of arr is 0  1  2 3 4 5 6 7 8 9  10 11 12
    int[] arr = {100, 99, 88,77,66,55,44,33,22,11,00};
    int target = 1000;

    

    int ans  = binarySearchMethod(arr, target);
    System.out.println(ans);
  }

}
