//Jay �M Jolin ���@�P����� $10,000.-
class BankAccount {
    private int balance = 10000;
    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }
} 

//�ϥ�Runnable�A��Ӱ�������O�sJay��Jolin�A��start�srun
public class JayAndJolin implements Runnable {

    private BankAccount account = new BankAccount();

    public static void main (String [] args) {
        JayAndJolin  theJob = new JayAndJolin();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Jay");
        two.setName("Jolin");
        one.start();
        two.start();
    }
    
//�C����1,000,�M��|�U��10���A�b��S����"��L�Y�F!"
    public void run() {
        for(int x = 0; x < 10; x++) {
            makeWithdrawal(1000);
            if(account.getBalance() < 0) {
                System.out.println("��L�Y�F!");
            }
        }
    }
    
/*�C�����ڳ��|�o��4�ӨB�J:
1�Bif{�h���� >
2�B   try{�h��ı(0.5s)}>
3�B   catch{}�_��>
4�B   (����)��������>}
5�Belse{��p�A�S������������+name}
*/
    //private synchronized void makeWithdrawal(int amount){
    private void makeWithdrawal(int amount){
        if(account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + " �h����");
            try {
                System.out.println(Thread.currentThread().getName() + " �h��ı");
                Thread.sleep(500);
            } 
            catch(InterruptedException ex){ex.printStackTrace(); }
            System.out.println(Thread.currentThread().getName() + " �_��");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " ��������" + account.getBalance() );
        }
        else{
            System.out.println("��p�A�S������������ " + Thread.currentThread().getName());
        }
    }
}
