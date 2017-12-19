/*多執行緒
Thread{
	super(0);
}

Thread 執行緒 : 
有 start 跟   run 
喊 start 就跑 run 
*/

public class TestThread extends Thread{
    public static void main (String args[]){
        TestThread t1 = new TestThread("T1");
        TestThread t2 = new TestThread("T2");
        
        t1.start();
        t2.start();
        for (int i=0;i<50;i++){
            System.out.print(Thread.currentThread().getName()+":");
            System.out.println(i);
        }   //來亂的,Main也是個Thread , 但主要拿來分派工作的
    }
        //建構子
    TestThread(String name){
        super(name);
            //原本就會super(); 會沒辦法跑，所以在()內放入name
    }

    public void run(){
        for (int i=0;i<50;i++){
            System.out.print(Thread.currentThread().getName()+":");
            System.out.println(i);
        }
    }
}