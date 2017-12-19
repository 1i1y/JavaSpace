public class Testobj{
    public static void main(String args[]){
        Testobj obj = new Testobj();
        
        System.out.println(obj.toString()); //印1:被下面那個(ln 16 的"測試")改掉原本toString的值了
        System.out.println(obj.hashCode()); //印2:
    
    // toString的值是很好改掉的
        Integer i = new Integer(12);
        String  s = new String("這是String");
        System.out.println(i.toString());   //印3:
        System.out.println(s.toString());   //印4:
    }
    
    public String toString(){
        return"測試";
    }
}