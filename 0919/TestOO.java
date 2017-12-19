public class TestOO{
    public static void main(String args[]){
        Object o = new String("Hello");
        System.out.println(o.toString());
        
        String s =(String)o; //物件Object型態強制改字串String
        System.out.println(s.toUpperCase());// toUpperCase 小寫改大寫
        
        Integer i = new Integer(10);
        Double  d = new Double(1.0);
        test(s);
        test(i);
        test(d);
    }
    // 一式多型，instanceof判斷物件繼承關係
    static void test (Object o){
        if(o instanceof String){
            System.out.println("test多型-String");
        }
        else if(o instanceof Integer){
            System.out.println("test多型-Integer");
        }
        else if(o instanceof Double){
            System.out.println("test多型-Double");
        }
        else{
        System.out.println("test多型-你怎麼打出這個不支援的型態的");
        }
    }
}