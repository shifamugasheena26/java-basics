import java.util.Scanner;
public class AverageOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 number : " );
        int arr[] = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int sum = 0;
        int average = 0;

        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }

            average=sum/arr.length;

        System.out.println("Total : " + sum);
        System.out.println("Average : " + average);
    }
}
