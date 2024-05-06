package CollectionsInJava;
import java.util.*;
public class StackDemo {

    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<String>();

        stack.push("Vikash");
        stack.push("For");
        stack.push("Vikash");
        stack.push("Mandloi");

        Iterator<String> itr = stack.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        itr = stack.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        }
    
}
