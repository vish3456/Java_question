import java.util.*;

public class customObects {
    String name;
    int rollno;

    customObects(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollno;
    }

    public static void main(String[] args) {
        ArrayList<customObects> al = new ArrayList<>();
        al.add(new customObects("A", 1));
        al.add(new customObects("B", 2));
        al.add(new customObects("C", 3));
        al.add(new customObects("D", 4));
        al.add(new customObects("E", 5));

        System.out.println(al);
    }
}

