// package Collection;
import java.util.*;
import java.util.Collection;

public class DemoClass {
    public static void main(String[] args) {
        Collection<Integer> values=new ArrayList<Integer>();
        
        values.add(1);
       
        values.add(7);
       values.add(4);
       System.out.println(values.getClass().getName()); 

        // Collections.sort(null);
        Iterator i=values.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
