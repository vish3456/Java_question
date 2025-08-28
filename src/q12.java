import java.util.*;
public class q12 {
    public static void main(String[] args) {
        ArrayList<String> al =  new ArrayList<>();
        al.add("red");
        al.add("green");
        al.add("blue");
        al.add("yellow");
        al.remove("blue");
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        System.out.println(al.remove("white"));
        // how  to create arraylist from array
        String[] c = {"red", "green", "blue", "yellow"};
        ArrayList<String> al2 =  new ArrayList<>(Arrays.asList(c));
        System.out.println(al2);

    }
}
