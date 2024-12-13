/*
{sno=001, snmae=sv}
{sno=001}
{}
*/
import java.util.*;
class hashmap_methods{
    public static void main(String [] args){
        HashMap<String,String> a=new HashMap<>();
        a.put("sno","39");
        a.put("snmae","sv");
        // modify value by key
        a.put("sno","001");
        System.out.println(a);
        //removing keys on hash
        a.remove("snmae");
        System.out.println(a);
        a.clear();
        System.out.println(a);

    }
}