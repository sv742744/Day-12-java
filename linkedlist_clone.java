/*
5
1 3  2 5 6
[6, 5, 2, 3, 1]
*/
import java.util.*;
public class linkedlist_clone{
    public static void main(String args[]){
        LinkedList<Integer> a=new LinkedList<>();
        //cloning in linkedlists
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            int s=sc.nextInt();
            a.addFirst(s);
        }
        LinkedList<Integer> b=new LinkedList<>();
        b=(LinkedList)a.clone();
        System.out.println(b); 
    }
}