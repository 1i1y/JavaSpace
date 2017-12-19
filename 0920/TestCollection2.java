import java.util.*;                              //until家族通通抓進來

public class TestCollection2{
    public static void main (String args[]){
        List s = new ArrayList();                //List 與 Set 都是 Collectionn家族，所以改兩個地方就能跑了
        s.add(1);                                //給值
        s.add("Hello");
        s.add(2.0);
        s.add(3);
        System.out.println(s);                   //印出
        
        Iterator it = s.iterator();              //Iterator 最輕量結構，還可以放異型態
        while(it.hasNext()){                     //當it還有下一個時就印出下一個
            System.out.println(it.next());
        }
    }
}