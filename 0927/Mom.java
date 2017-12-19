// try catch  、 Thread 、 sleep 、join 運用

public class Mom extends Thread{
    public static void main(String args[]){
        Mom m = new Mom();
        m.start();
    }
    public void run(){
        System.out.println("準備茄汁炒飯...");
        try{Thread.sleep(500);}catch(Exception e){}
        System.out.println("發現沒有茄汁...");
        try{Thread.sleep(500);}catch(Exception e){}
        System.out.println("請兒子買茄汁...");
        try{Thread.sleep(500);}catch(Exception e){}
        Son s = new Son();
        s.start();
        //s.join();
        try{s.join();}catch(Exception e){}
        //媽媽等兒子買茄汁，但沒用join時，可能發生還沒買到茄汁就己經完成茄汁炒飯了
        //join ->  throws InterruptedException
        //s.join();
        System.out.println("拿到買茄汁...");
        try{Thread.sleep(500);}catch(Exception e){}
        System.out.println("完成茄汁炒飯...");
        try{Thread.sleep(500);}catch(Exception e){}
    }
}
class Son extends Thread{
    public void run(){
        System.out.println("\t買茄汁...");
        try{Thread.sleep(500);}catch(Exception e){}
        System.out.println("\t買到茄汁...");
        try{Thread.sleep(500);}catch(Exception e){}
		// join 是等這邊兒子的事做完再回去執行"拿到買茄汁"
    }
}