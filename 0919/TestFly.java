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
        System.out.println("加速起飛");
    }
    public void land(){
        System.out.println("減速降落");
    }
}
class superman implements Fly{
    public void fly(){
        System.out.println("垂直起飛");
    }
    public void land(){
        System.out.println("垂直降落");
    }
}