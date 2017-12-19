//void 是無返回值的意思
//沒void就要有return~
public class Account{
	//屬性
	String accountNumber;
	int    balance;
	
	//方法
	//提款
	void withdraw(int m){
		balance = balance - m;
	}
	//存款
	void deposit(int m){
		balance = balance + m;
	}
	//看餘額
	int showBalance(){
		return balance;
	}
}