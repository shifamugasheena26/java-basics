package String;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args){
        String str = "cabfed";

        //SORTED USING IN-BUILT METHOD
        //covert  string to chararray
        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        //covert array back to string
        String sorted = new String(ch);
        System.out.println(sorted);



        //SORTED USING WITHOUT IN-BUILT METHOD
        //convert string to chararray
        char[] chararray = str.toCharArray();

        //apply bubble sort
        int n=str.length();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(chararray[j] > chararray[j+1]){
                    //swap
                    char temp=chararray[j];
                    chararray[j]=chararray[j+1];
                    chararray[j+1]=temp;
                }
            }
        }
        //convert array back to string
        String SortedString = new String(chararray);
        System.out.println(SortedString);
    }
}
