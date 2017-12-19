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
        System.out.println("連線成功…");
    }
    void disconn(){
        System.out.println("斷線成功…");
    }
    abstract void unlock();
}
class Apple extends Mobile{
    void unlock(){
        System.out.println("Face ID 解鎖");
    }
}
class Samsung extends Mobile{
    void unlock(){
        System.out.println("意念解鎖");
    }
}
