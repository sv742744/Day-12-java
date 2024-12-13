/*
HELLo 
students 
rajesh
*/
import java.util.*;
public class stringh_linked_hashset{
    public static void main(String args[]){
        // printing hash set
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("HELLo");
        a.add("HELLo");
        a.add("students");
        a.add("rajesh");
        a.add("students");
        for(String s:a){
        System.out.println(s+" ");
        }
    }
}