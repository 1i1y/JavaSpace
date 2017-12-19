//  http://192.168.3.156:8080
public class Account{
    //屬性
    int balance;
    String accountNumber;
    
    //建構子
    Account(int balance, String accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    
    //方法
    void withdraw(int m){
        balance -= m;
    }
    void deposit(int m){
        balance += m;
    }
    int getBalance(){
        return balance;
    }
    String getAccountNumber(){
        return accountNumber;
    }
}