import java.util.*;                              //until�a�ڳq�q��i��

public class TestCollection{
    public static void main (String args[]){
        Set s = new HashSet();                   //��HashSet
        s.add(1);                                //����
        s.add("Hello");
        s.add(2.0);
        s.add(3);
        System.out.println(s);                   //�L�X�A�}�C���S���ǥi��
        
        Iterator it = s.iterator();              //Iterator �̻��q���c�A�٥i�H�񲧫��A
        while(it.hasNext()){                     //��it�٦��U�@�ӮɴN�L�X�U�@�ӡA�N�O�@�Ӥ@�ӦL�X
            System.out.println(it.next());
        }
    }
}