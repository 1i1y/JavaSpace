//這是個同時跑3個執行緒的練習
//Thread 執行緒 : 有 start 跟 run ，喊start就跑run
public class TestThread extends Thread{              //繼承Thread
    public static void main( String args[]){
        TestThread t = new TestThread();
        t.start();                                   //start與run一家的
        TestThread t2 = new TestThread();
        t2.start(); 
        TestThread t3 = new TestThread();
        t3.start(); 
    }
    public void run(){
        for(int i=0; i<50; i++){
            System.out.print(Thread.currentThread().getName()+":");
            System.out.println(i);                   //同時跑3個執行緒
        }
    }
}