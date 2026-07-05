package String;

public class RemovingString {
    public static void main(String[] args){
        String name = "Shifa Mugasheena";
        char remove = 'a';

        //removing 'a' using in-built method (replace())
      String result = name.replace(String.valueOf(remove), "");
        System.out.println("After removing " + remove + "(using in-built method)" +":" + result);


        //removing 'a' using without in-built method
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) != remove){      //name la ulla each character remove pandrathula illana atha direct ta add pannanu
                sb.append(name.charAt(i));
            }
        }
        System.out.println("After removing " + remove + "(using not in-built method)" + ":" + sb.toString());

    }
}
