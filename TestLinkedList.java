import java.util.*;

public class TestLinkedList {
    public static void main(String[] args) {
        Deque<String> al= new LinkedList<String>();
        al.add( "Ravi");
        al.add("Vijay");
        // list.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
   
        Iterator<String> itr= al.iterator();
        while(itr.hasNext()){
            System.out.println(al);
        }
   
   
    }
}
