// try catch  �B Thread �B sleep �Bjoin �B��

public class Mom extends Thread{
    public static void main(String args[]){
        Mom m = new Mom();
        m.start();
    }
    public void run(){
        System.out.println("�ǳƭX�Ī���...");
        try{Thread.sleep(500);}catch(Exception e){}
        System.out.println("�o�{�S���X��...");
        try{Thread.sleep(500);}catch(Exception e){}
        System.out.println("�Ш�l�R�X��...");
        try{Thread.sleep(500);}catch(Exception e){}
        Son s = new Son();
        s.start();
        //s.join();
        try{s.join();}catch(Exception e){}
        //��������l�R�X�ġA���S��join�ɡA�i��o���٨S�R��X�ĴN�v�g�����X�Ī����F
        //join ->  throws InterruptedException
        //s.join();
        System.out.println("����R�X��...");
        try{Thread.sleep(500);}catch(Exception e){}
        System.out.println("�����X�Ī���...");
        try{Thread.sleep(500);}catch(Exception e){}
    }
}
class Son extends Thread{
    public void run(){
        System.out.println("\t�R�X��...");
        try{Thread.sleep(500);}catch(Exception e){}
        System.out.println("\t�R��X��...");
        try{Thread.sleep(500);}catch(Exception e){}
		// join �O���o���l���ư����A�^�h����"����R�X��"
    }
}