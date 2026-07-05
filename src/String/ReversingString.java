package String;

public class ReversingString {
    public static void main(String[] args) {
        String str = "Shifa";

        //reverse  string with in-built
        String result = new StringBuilder(str).reverse().toString();  //StringBuilder covert string to mutable
        System.out.println(result);                                   //reverse()  reverse str=Shifa
        //toString() print reverse string

        //reverse string without in-built(worst approach) += operator
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);


        //reverse  string without += operator (StringBuilder) best approach
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
