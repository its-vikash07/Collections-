package CollectionsInJava;
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");

        System.out.println("Original LinkedList:"+animals);

        animals.add(1,"Elephant");

        System.out.println("Updated LinkedList:"+animals);

        animals.remove(1);
        animals.remove("Cow");

        System.out.println("Updated LinkedList:"+animals);
    }
    
}
