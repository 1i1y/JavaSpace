/* 
<E>  - 此函數可以"限定"為任一個型態

Set  - HashSet   : 沒有順序，不會重復
List - ArrayList : 有順序，可重復
*/
import java.util.*;
public class TestColl1String{
    public static void main (String args[]){
        Set<String> s = new HashSet<String>();    //強制set轉型態為String
        s.add("One");
        s.add("Two");
        s.add("Three");
        
        //s.add(4);                               //就不能接受其它型態了
        System.out.println(s);        
        
        for  ( String o :s ){                     //∵強制轉型態為String ∴for迴圈內寫的是String
            System.out.println( o.toUpperCase() );
        }
    }
}