/*
5
hello
sv
sumanth
manoj
jeevan
[sv, manoj, jeevan, hello, sumanth]
*/
import java.util.*;
public class accepting_strings_in_hashset{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //hash set dynamic
        HashSet<String> a=new HashSet<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            a.add(s);
        }
        System.out.println(a);
    }
}