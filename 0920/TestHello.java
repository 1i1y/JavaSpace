
import com.oracle.Hello;                      // 預設都有import java.lang.*; java.lang的全部都可只寫類別名 Hello h= new Hello();
import static java.lang.System.out;           //out.println("");
import static java.lang.Integer.*;
//import static java.lang.Integer.parseInt;   //out.println(parseInt("150"+1);
//import static java.lang.Byte.*;             //Integer 與 Byte 都有 MAX_VALUE，相衝沒法跑

public class TestHello{
    public static void main (String args[]){
        //com.oracle.Hello h = new com.oracle.Hello(); //寫全名才能跑啊~
        Hello h = new Hello();                         // ∵import com.oracle.Hello;
        h.sayHello();
        out.println("import static 測試");
        out.println(parseInt"150")+1);
        out.println(MAX_VALUE);                        // 可能import 進來同名的類別名
        
    }
}

//別忘了Hello.java 在package裡面(com.oracle)
// javac -d . Hello.java
// javac TestHello.java
// java TestHello
