/*�h�����
Thread{
	super(0);
}

Thread ����� : 
�� start ��   run 
�� start �N�] run 
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
        }   //�Ӷê�,Main�]�O��Thread , ���D�n���Ӥ����u�@��
    }
        //�غc�l
    TestThread(String name){
        super(name);
            //�쥻�N�|super(); �|�S��k�]�A�ҥH�b()����Jname
    }

    public void run(){
        for (int i=0;i<50;i++){
            System.out.print(Thread.currentThread().getName()+":");
            System.out.println(i);
        }
    }
}