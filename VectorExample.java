package CollectionsInJava;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector:"+vector);

        vector.remove(0);
        vector.remove(Integer.valueOf(20));

        System.out.println("Vector:"+ vector);

    }
    
}
