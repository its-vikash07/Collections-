package CollectionsInJava;
import java.util.*;
public class LinkedHashSetDemo {

    public static void main(String[] args) {
        
        LinkedHashSet<String> hs = new LinkedHashSet<String>();

        hs.add("Java");
        hs.add("For");
        hs.add("Java");
        hs.add("Is");
        hs.add("Very helpful");

        Iterator<String> itr = hs.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());

        }

    }
    
}