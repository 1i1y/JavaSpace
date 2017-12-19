/* 
Set  - HashSet   : �S�����ǡA���|���_
List - ArrayList : �����ǡA�i���_

�v�ӦL�X:
1.for( : ){}
2.Iterator + while( .hasNext()){}
*/
import java.util.*;
public class TestColl1{
    public static void main (String args[]){
        Set s = new HashSet();
        s.add(5);
        s.add("One");
        s.add(1.0);
        s.add(true);
        
        System.out.println(s);
        
        s.add(1.0);
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