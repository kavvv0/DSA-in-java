import java.util.*;
 class arrdeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>(10);
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.addFirst(40);
        arrayDeque.addLast(30);
        arrayDeque.add(50);
        System.out.println(arrayDeque);
       System.out.println(arrayDeque.size()); 
        arrayDeque.spliterator();
        System.out.println(arrayDeque.toString());
        arrayDeque.clear();
        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.addFirst(5);
        arrayDeque.addLast(6);
        System.out.println(arrayDeque);
        

    }
}
