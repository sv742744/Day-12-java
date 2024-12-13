/*
5
1 2 3 4 5 
[5, 4, 3, 2, 1]
5 4 3 2 1
*/
import java.util.*;
class dynamic_linkedlist{
    public static void main(String [] args){
        LinkedList<Integer> a=new LinkedList<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int b=s.nextInt();
        a.addFirst(b);
        }
        System.out.println(a);
        for(int j=0;j<a.size();j++){
            System.out.print(a.get(j)+" ");
        }

    }
}