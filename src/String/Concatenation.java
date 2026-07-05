package String;

public class Concatenation {
    public  static void main(String[] args){
        String s1 = "hello";
        String s2 = "world";

        //concatenate (combine using in-built)
        System.out.println(s1 + " " + s2);

        //without in-built
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(" ").append(s2);   //chaining .append().append().....
        System.out.println(sb.toString());
    }
}
