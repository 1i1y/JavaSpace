import java.util.*;                              //until家族通通抓進來

public class TestCollection3{
    public static void main (String args[]){
        List s = new ArrayList();                //List 與 Set 都是 Collectionn家族，所以改兩個地方就能跑了
        s.add(1);                                //給值
        s.add("Hello");
        s.add(2.0);
        s.add(3);
        System.out.println(s);                   //印出
        
        
        for(int i=0; i<s.size();i++){            //印出每個順序的值
            System.out.println("s["+i+"]="+s.get(i));
        }
    }
}