//�o�� Account �� class �O���F�� AccMain
public class Account{
	//�ݩ�
	String accountNumber;
	int balance;
	//static int balance;
	//static �u��{���ӥ��s�b�A�A�����N�O�j�a����
	
	//�غc�l
	/*
	Account(String an,int b){
		//...�o�̥i�H��@�����Ҥ���
		accountNumber = an;
		balance = b;
	}
	*/
	
	//this  �o�����O��, ���Y�Ԫ��g�k
	Account(String accountNumber,int balance){          //����ӭ�:�b��,�b����B
		this.accountNumber = accountNumber;             //�o��accountNumber(ln 3)����accountNumber(ln 16)
		this.balance = balance;                         //�o��balance(ln 3)����balance(ln 16)
	}
	
	//��k
		//����
	void withdraw(int m){ 
		balance = balance - m;
	}
		//�s��
	void deposit(int m){
		balance = balance + m;
	}
		//�l�B
	public int getBalance(){                             //�[public�O�Ҩ�����
		return balance;
	}
		//�b��
	public String getAccountNumber(){                    //�[public�O�Ҩ�����
		return accountNumber;
	}
}