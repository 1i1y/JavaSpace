import java.util.*;                              //until家族通通抓進來

public class TestCollection{
    public static void main (String args[]){
        Set s = new HashSet();                   //用HashSet
        s.add(1);                                //給值
        s.add("Hello");
        s.add(2.0);
        s.add(3);
        System.out.println(s);                   //印出，陣列但沒順序可言
        
        Iterator it = s.iterator();              //Iterator 最輕量結構，還可以放異型態
        while(it.hasNext()){                     //當it還有下一個時就印出下一個，就是一個一個印出
            System.out.println(it.next());
        }
    }
}