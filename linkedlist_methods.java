/*
[1000, 453, 3254, 27]
[222, 1000, 453, 3254, 27]
[222, 1000, 453, 3254, 27, 555]
*/
import java.util.*;
class linkedlist_methods{
    public static void main(String [] args){
        LinkedList<Integer> a=new LinkedList<>();
        a.add(1000);
        a.add(453);
        a.add(3254);
        a.add(27);
        System.out.println(a);
        a.addFirst(222);
        System.out.println(a);
        a.addLast(555);
        System.out.println(a);

    }
}