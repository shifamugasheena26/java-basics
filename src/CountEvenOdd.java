public class CountEvenOdd {
    public static void main(String[] args){
        int arr[] = {10,15,20,7,8,11};
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                evencount++;
            }
            else
            {
                oddcount++;
            }
        }
        System.out.println("Even Count = " + evencount);
        System.out.println("Odd Count = " + oddcount);
    }
}
