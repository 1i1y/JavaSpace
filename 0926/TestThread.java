//�o�O�ӦP�ɶ]3�Ӱ�������m��
//Thread ����� : �� start �� run �A��start�N�]run
public class TestThread extends Thread{              //�~��Thread
    public static void main( String args[]){
        TestThread t = new TestThread();
        t.start();                                   //start�Prun�@�a��
        TestThread t2 = new TestThread();
        t2.start(); 
        TestThread t3 = new TestThread();
        t3.start(); 
    }
    public void run(){
        for(int i=0; i<50; i++){
            System.out.print(Thread.currentThread().getName()+":");
            System.out.println(i);                   //�P�ɶ]3�Ӱ����
        }
    }
}