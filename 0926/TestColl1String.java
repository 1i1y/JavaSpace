/* 
<E>  - ����ƥi�H"���w"�����@�ӫ��A

Set  - HashSet   : �S�����ǡA���|���_
List - ArrayList : �����ǡA�i���_
*/
import java.util.*;
public class TestColl1String{
    public static void main (String args[]){
        Set<String> s = new HashSet<String>();    //�j��set�૬�A��String
        s.add("One");
        s.add("Two");
        s.add("Three");
        
        //s.add(4);                               //�N���౵���䥦���A�F
        System.out.println(s);        
        
        for  ( String o :s ){                     //��j���૬�A��String ��for�j�餺�g���OString
            System.out.println( o.toUpperCase() );
        }
    }
}