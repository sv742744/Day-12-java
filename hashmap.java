/*
{sno=39, snmae=sv}
39
*/
import java.util.*;
class hashmap{
    public static void main(String [] args){
        HashMap<String,String> a=new HashMap<>();
        a.put("sno","39");
        a.put("snmae","sv");
        System.out.println(a);
        // {sno=39, snmae=sv}
        //printing hash by key value
        if(a.containsKey("sno")){
            String d=a.get("sno");
            System.out.println(d);
        }
    }
}