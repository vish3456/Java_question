import java.util.*;
public class q13 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
       for(int i=1;i<=10;i++){
           al.add(i);
       }
       System.out.println(al);
       System.out.println(al.contains(5));
       System.out.println(al.indexOf(5));
       System.out.println(al.lastIndexOf(5));

    }
}
