
import com.oracle.Hello;                      // �w�]����import java.lang.*; java.lang���������i�u�g���O�W Hello h= new Hello();
import static java.lang.System.out;           //out.println("");
import static java.lang.Integer.*;
//import static java.lang.Integer.parseInt;   //out.println(parseInt("150"+1);
//import static java.lang.Byte.*;             //Integer �P Byte ���� MAX_VALUE�A�۽ĨS�k�]

public class TestHello{
    public static void main (String args[]){
        //com.oracle.Hello h = new com.oracle.Hello(); //�g���W�~��]��~
        Hello h = new Hello();                         // ��import com.oracle.Hello;
        h.sayHello();
        out.println("import static ����");
        out.println(parseInt"150")+1);
        out.println(MAX_VALUE);                        // �i��import �i�ӦP�W�����O�W
        
    }
}

//�O�ѤFHello.java �bpackage�̭�(com.oracle)
// javac -d . Hello.java
// javac TestHello.java
// java TestHello
