import java.util.*;
public class TestTreeSet {
   public static void main(String[] args) {
    TreeSet<String> treeSet= new TreeSet();
    treeSet.add( "Ravi");
        treeSet.add("Vijay");
        treeSet.add("Ravi");
        treeSet.add("Ajay");
        Iterator<String> itr= treeSet.iterator();

   }   
}
