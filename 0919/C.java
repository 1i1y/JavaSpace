class D{
    D(){
        System.out.println("�����O�Q�I�s�K")
    }
    D(int i){
        System.out.println("�����Oint�Ѽƪ��غc�l�Q�I�s�K")
    }
public class C extends D{
    C(){
        super(0); //�N�|��D(int i)
        System.out.println("�l���O�Q�I�s�K")
    }
    public static void main(String args[]){
        C c = new C();
    }
}


