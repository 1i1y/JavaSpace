public class TestFly{
    public static void main(String args[]){
            Fly f1= new airPlane();
            Fly f2= new superman();
            f1.fly();
            f1.land();
            f2.fly();
            f2.land();
    }
}

class airPlane implements Fly{
    public void fly(){
        System.out.println("�[�t�_��");
    }
    public void land(){
        System.out.println("��t����");
    }
}
class superman implements Fly{
    public void fly(){
        System.out.println("�����_��");
    }
    public void land(){
        System.out.println("��������");
    }
}