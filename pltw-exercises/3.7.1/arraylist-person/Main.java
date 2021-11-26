import java.util.ArrayList;
public class Main {

    public static void main(String [] args) {
        ArrayList<Person> list = new ArrayList<Person>();  

        
        Person four = new Person("Sandy", 50, true);
        // Person five = new Person("Joe", false); // cant do this because there's no age int
        
        list.add(new Person("Sandy", 50, true));
        list.add(new Person("Bob", 50, true));
        list.add(new Person("Loio", 50, true));

        System.out.println(list);
   
    }
    
}
