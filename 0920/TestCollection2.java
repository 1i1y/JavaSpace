import java.util.*;                              //until�a�ڳq�q��i��

public class TestCollection2{
    public static void main (String args[]){
        List s = new ArrayList();                //List �P Set ���O Collectionn�a�ڡA�ҥH���Ӧa��N��]�F
        s.add(1);                                //����
        s.add("Hello");
        s.add(2.0);
        s.add(3);
        System.out.println(s);                   //�L�X
        
        Iterator it = s.iterator();              //Iterator �̻��q���c�A�٥i�H�񲧫��A
        while(it.hasNext()){                     //��it�٦��U�@�ӮɴN�L�X�U�@��
            System.out.println(it.next());
        }
    }
}