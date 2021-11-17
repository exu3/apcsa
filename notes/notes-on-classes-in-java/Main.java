import java.util.ArrayList;
public class Main {

    public static void main(String [] args) {
        ArrayList<String> list = new ArrayList<String>();  

        
        Person four = new Person("Sandy", 50, true);
        // Person five = new Person("Joe", false); // cant do this because there's no age int
        
        list.add(new Person("Sandy", 50, true).toString());

        System.out.println(list);
   
    }
    
}
