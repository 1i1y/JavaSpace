public class TestRunnable2 implements Runnable{
    public static void main(String args[]){
        /*
        TestRunnable2 r = new TestRunnable2();
        Thread t = new Thread(r);
        t.start();
        
        //*******sample 1**********
        Thread t1 = new Thread(new TestRunnable2());
        t1.start();
        //*******sample 2**********�ΦW���O
        Thread t2 = new Thread(new TestRunnable2(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(i);
                }
            }
        });
        t2.start();
        //*******sample 3**********�ΦW���O
        Thread t3 = new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(i);
                }
            }
        };
        t3.start();
        */
        //*******sample 4**********�ΦW���O
        // �o�ˬ� 
		// >>>>> (new Thread()).start();  <<<<<
		//
        (new Thread(){
            public void run(){ 
                for(int i=0;i<10;i++){
                    System.out.println("�ΦW���O�G"+i);
                }
            }
        }).start();
    }
    
	// �غc�l run
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}