public class TestAbstract{
    public static void main(String args[]){
        Mobile m1 = new Apple();
        Mobile m2 = new Samsung();
        m1.unlock();
        m2.unlock();
    }
}
abstract class Mobile{
    void conn(){
        System.out.println("�s�u���\�K");
    }
    void disconn(){
        System.out.println("�_�u���\�K");
    }
    abstract void unlock();
}
class Apple extends Mobile{
    void unlock(){
        System.out.println("Face ID ����");
    }
}
class Samsung extends Mobile{
    void unlock(){
        System.out.println("�N������");
    }
}
