package CollectionsInJava;
import java.util.*;
public class ArrayDequeDemo {

    public static void main(String[] args) {
        
        ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);
        
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);

        de_que.clear();

        de_que.addFirst(500);
        de_que.addFirst(400);

        de_que.addLast(40);
        de_que.addLast(50);

        System.out.println(de_que);

    }
    
}
