//void �O�L��^�Ȫ��N��
//�Svoid�N�n��return~
public class Account{
	//�ݩ�
	String accountNumber;
	int    balance;
	
	//��k
	//����
	void withdraw(int m){
		balance = balance - m;
	}
	//�s��
	void deposit(int m){
		balance = balance + m;
	}
	//�ݾl�B
	int showBalance(){
		return balance;
	}
}