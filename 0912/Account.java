//這個 Account 的 class 是為了給 AccMain
public class Account{
	//屬性
	String accountNumber;
	int balance;
	//static int balance;
	//static 優於程式而先存在，你的錢就是大家的錢
	
	//建構子
	/*
	Account(String an,int b){
		//...這裡可以放一些驗證什麼的
		accountNumber = an;
		balance = b;
	}
	*/
	
	//this  這個類別的, 較嚴謹的寫法
	Account(String accountNumber,int balance){          //有兩個值:帳號,帳戶金額
		this.accountNumber = accountNumber;             //這個accountNumber(ln 3)等於accountNumber(ln 16)
		this.balance = balance;                         //這個balance(ln 3)等於balance(ln 16)
	}
	
	//方法
		//提款
	void withdraw(int m){ 
		balance = balance - m;
	}
		//存款
	void deposit(int m){
		balance = balance + m;
	}
		//餘額
	public int getBalance(){                             //加public保證取的到
		return balance;
	}
		//帳號
	public String getAccountNumber(){                    //加public保證取的到
		return accountNumber;
	}
}