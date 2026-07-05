package String;

public class Identical {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "heelo";

        // check in-build method(equals())
        System.out.println(str1.equals(str2));

        // check without (equals()) method
        System.out.println(issamestr(str1,str2));
    }

    public static boolean issamestr(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n != m) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;

    }
}

