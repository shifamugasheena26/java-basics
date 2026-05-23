import java.util.Scanner;
public class NumberPalindrome {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int a = num;
        int reverse = 0;

        while(a>0){
            reverse = reverse*10 + (a%10);
            a=a/10;
        }

        if(num==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
