class D{
    D(){
        System.out.println("父類別被呼叫…")
    }
    D(int i){
        System.out.println("父類別int參數的建構子被呼叫…")
    }
public class C extends D{
    C(){
        super(0); //就會跟D(int i)
        System.out.println("子類別被呼叫…")
    }
    public static void main(String args[]){
        C c = new C();
    }
}


