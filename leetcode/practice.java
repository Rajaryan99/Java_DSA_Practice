

public class practice {
    public static void main(String[] args) {
        int[] arr  ={0,1};
        missingNo(arr);
       
        
    }

public static int missingNo(int[] arr){
    int i=0; 
    while(i < arr.length-1){
        int cIdx =  arr[i];
        if(arr[i] < arr.length && arr[i] != arr[cIdx]){
            swap(arr, i, cIdx);
        } else{
            i++;
        }
    }

    if(arr[i] != i){
        System.out.println(i);
    }
    return -1;
}

public static void swap(int[] arr, int first, int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp; 
}

}
