import java.util.*;                              //until�a�ڳq�q��i��

public class TestCollection3{
    public static void main (String args[]){
        List s = new ArrayList();                //List �P Set ���O Collectionn�a�ڡA�ҥH���Ӧa��N��]�F
        s.add(1);                                //����
        s.add("Hello");
        s.add(2.0);
        s.add(3);
        System.out.println(s);                   //�L�X
        
        
        for(int i=0; i<s.size();i++){            //�L�X�C�Ӷ��Ǫ���
            System.out.println("s["+i+"]="+s.get(i));
        }
    }
}