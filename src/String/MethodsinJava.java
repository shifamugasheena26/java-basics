package String;
public class MethodsinJava {
    public static void main(String[] args) {

        String str = " Shifa Mugasheena  ";
                    //1234567890123456789//
             //index  0123456789012345678
        System.out.println(str.length());                          // 19
        System.out.println(str.charAt(6));                         // " " empty space
        System.out.println(str.substring(7,12));                   // Mugas
        System.out.println(str.toLowerCase());                     //  shifa mugasheena (with space)
        System.out.println(str.toUpperCase());                     //  SHIFA MUGASHEENA (with space)
        System.out.println(str.trim());                            //Shifa Mugahseena   (remove space starting and ending)
        System.out.println(str.replace("a","x")); // Shifx Mugxsheenx
        System.out.println(str.startsWith(" Shifa"));              // start with space (TRUE)
        System.out.println(str.endsWith("Mugasheena  "));          // end with 2 spaces(TRUE)
        System.out.println(str.indexOf("Mugasheena"));             // 7 (M start with index 7)
        System.out.println(str.contains("sheena"));                // true
    }
}
