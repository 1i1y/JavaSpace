/* 
List - ArrayList  : 有順序，可重復
List - LinkedList : 連線，排序快
*/
import java.util.*;
public class TestColl2LinkedList{
    public static void main (String args[]){
        LinkedList s = new LinkedList();
        s.add(5);
        s.add("One");
        s.add(1.0);
        s.add(true);
        
        System.out.println(s);
        
        s.add(1.0);
        s.addFirst(999);
        System.out.println(s);  
         
        //1.for( : ){}
        for  ( Object o :s ){
            System.out.println( o );
        }
        //2.Iterator + while( .hasNext()){}
        Iterator it = s.iterator();
        while ( it.hasNext()){
            System.out.println(it.next());
        }        
    }
}