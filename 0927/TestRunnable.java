//�ݨ�G������� �@�y�@�y �� �Ʀr�W�[
public class TestRunnable implements Runnable{
    public static void main (String args[]){
        TestRunnable r1 = new TestRunnable();
        Thread t1 = new Thread(r1,"R1");    // Thread ���W�h:Thread(Runnable target, String name)
        t1.start();
        
        TestRunnable r2 = new TestRunnable();
        Thread t2 = new Thread(r2,"R2");
        t2.start();
    }
    public void run(){
        for (int i=0;i<50;i++){
            System.out.print(Thread.currentThread().getName()+":");
            System.out.println(i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){}
        }
    }
}