//  http://192.168.3.156:8080
public class Account{
    //�ݩ�
    int balance;
    String accountNumber;
    
    //�غc�l
    Account(int balance, String accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    
    //��k
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