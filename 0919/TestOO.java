public class TestOO{
    public static void main(String args[]){
        Object o = new String("Hello");
        System.out.println(o.toString());
        
        String s =(String)o; //����Object���A�j���r��String
        System.out.println(s.toUpperCase());// toUpperCase �p�g��j�g
        
        Integer i = new Integer(10);
        Double  d = new Double(1.0);
        test(s);
        test(i);
        test(d);
    }
    // �@���h���Ainstanceof�P�_�����~�����Y
    static void test (Object o){
        if(o instanceof String){
            System.out.println("test�h��-String");
        }
        else if(o instanceof Integer){
            System.out.println("test�h��-Integer");
        }
        else if(o instanceof Double){
            System.out.println("test�h��-Double");
        }
        else{
        System.out.println("test�h��-�A��򥴥X�o�Ӥ��䴩�����A��");
        }
    }
}