public class celing {
    public static int findTarget(int arr[], int target){

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
    return ;
  }

  public static void main(String[] var0) {
      int[] var1 = new int[]{1, 2,3, 5,8,10};
      short var2 = 10;
      int var3 = findTarget(var1, var2);
      System.out.println(var3);
   }

}
