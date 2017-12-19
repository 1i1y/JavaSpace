public class TestRunnable2 implements Runnable{
    public static void main(String args[]){
        /*
        TestRunnable2 r = new TestRunnable2();
        Thread t = new Thread(r);
        t.start();
        
        //*******sample 1**********
        Thread t1 = new Thread(new TestRunnable2());
        t1.start();
        //*******sample 2**********匿名類別
        Thread t2 = new Thread(new TestRunnable2(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(i);
                }
            }
        });
        t2.start();
        //*******sample 3**********匿名類別
        Thread t3 = new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(i);
                }
            }
        };
        t3.start();
        */
        //*******sample 4**********匿名類別
        // 這樣看 
		// >>>>> (new Thread()).start();  <<<<<
		//
        (new Thread(){
            public void run(){ 
                for(int i=0;i<10;i++){
                    System.out.println("匿名類別："+i);
                }
            }
        }).start();
    }
    
	// 建構子 run
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}