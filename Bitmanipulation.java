public class Bitmanipulation {
    public static void main(String args[]){
        int n =5;
        int pos =2;
        int bitMask  = 1<<pos;
        int notno = ~(bitMask);

        int newNo = notno & n;

        System.out.println(newNo);
    }
}
