//Jay 和 Jolin 的共同基金有 $10,000.-
class BankAccount {
    private int balance = 10000;
    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }
} 

//使用Runnable，兩個執行緒分別叫Jay跟Jolin，用start叫run
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
    
//每次領1,000,然後會各領10次，帳戶沒錢說"領過頭了!"
    public void run() {
        for(int x = 0; x < 10; x++) {
            makeWithdrawal(1000);
            if(account.getBalance() < 0) {
                System.out.println("領過頭了!");
            }
        }
    }
    
/*每次提款都會發生4個步驟:
1、if{去提款 >
2、   try{去睡覺(0.5s)}>
3、   catch{}起床>
4、   (提款)完成提款>}
5、else{抱歉，沒有足夠的錢給+name}
*/
    //private synchronized void makeWithdrawal(int amount){
    private void makeWithdrawal(int amount){
        if(account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + " 去提款");
            try {
                System.out.println(Thread.currentThread().getName() + " 去睡覺");
                Thread.sleep(500);
            } 
            catch(InterruptedException ex){ex.printStackTrace(); }
            System.out.println(Thread.currentThread().getName() + " 起床");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " 完成提款" + account.getBalance() );
        }
        else{
            System.out.println("抱歉，沒有足夠的錢給 " + Thread.currentThread().getName());
        }
    }
}
