public class Testobj{
    public static void main(String args[]){
        Testobj obj = new Testobj();
        
        System.out.println(obj.toString()); //�L1:�Q�U������(ln 16 ��"����")�ﱼ�쥻toString���ȤF
        System.out.println(obj.hashCode()); //�L2:
    
    // toString���ȬO�ܦn�ﱼ��
        Integer i = new Integer(12);
        String  s = new String("�o�OString");
        System.out.println(i.toString());   //�L3:
        System.out.println(s.toString());   //�L4:
    }
    
    public String toString(){
        return"����";
    }
}