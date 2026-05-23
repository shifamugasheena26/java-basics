import java.util.Scanner;
class ArraySum {
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.println("Enter a number : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum : " + sum);
    }
}
class Main{
    public static void main(String[] args){
        ArraySum a = new ArraySum();
        a.display();
    }
}