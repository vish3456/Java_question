import java.util.*;

public class q14 {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e","f","g"};

        // Convert array to ArrayList
        ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));

        // Convert ArrayList back to array
        String [] arr_str = al.toArray(new String[0]);

        // Print result
        for(String s: arr_str){
            System.out.println(s);
        }
    }
}
