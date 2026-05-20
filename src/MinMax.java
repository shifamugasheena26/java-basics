import java.util.Scanner;
public class MinMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter Numbers:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum : " + max);
        System.out.println("Minimun : " + min);
    }
}
