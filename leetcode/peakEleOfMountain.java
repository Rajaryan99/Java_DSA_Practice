public class peakEleOfMountain {
    public static void main(String[] args) {

        int[] arr = {0,10,5,2};
        System.out.println(peakEle(arr));
        
    }

   public static int peakEle(int[] arr){
        int start = 0;
        int end  = arr.length -1;

        int mid  = start + (end - start)/2;

        return mid;
    }
}
