//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Book lib[] = new Book[3];
            lib[0] = new Book("harry potter","vish");
            lib[1] = new Book("chrish","mormond");
            lib[2] = new Book("oldbug","venkya");
            for(Book book : lib){
                System.out.println(book);

            }


    }
}