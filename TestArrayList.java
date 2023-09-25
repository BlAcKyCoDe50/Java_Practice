import java.util.ArrayList;
import java.util.List;
import java.util.*;

//Traversing with for each Loop
public class TestArrayList {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        list.add( "Ravi");
        list.add("Vijay");
        // list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
