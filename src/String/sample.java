package String;
public class sample {
    public static void main(String[] args){
        String str = "shifa";

       //normal string method
        for(int i=0;i<str.length();i++){
            System.out.println("Character at index of " +i+ ":" +str.charAt(i));
        }

        //String with charArray with normal loop
        char[] chararray = str.toCharArray();
        for(int i=0;i<chararray.length;i++){
            System.out.println(chararray[i]);
        }


        //covert array to string
        char[] Ch = str.toCharArray();
            System.out.println(new String(Ch));


        //String with chararray in each loop
        char[] charArray=str.toCharArray();
        for(char ch : str.toCharArray()){
            System.out.println(ch);
        }
    }
}