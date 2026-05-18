import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number :");
        int a = sc.nextInt();

        System.out.println("Enter Second Number :");
        int b = sc.nextInt();

        int sum=0;
        sum=a + b;

        System.out.println("Sum : " + sum);
    }
}
