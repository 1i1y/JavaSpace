//�ϥ�Account.java
public class AccMain{
	public static void main(String args[]) {
		
		//�b��1�A��$1000
		Account acc = new Account("000111-11223344",1000);
		//acc.withdraw(10); //��
		acc.deposit(100);   //��
		
		System.out.println(acc.getAccountNumber());
		System.out.println(acc.getBalance());
		
		//�b��2�A��$10000
		Account acc2 = new Account("000111-11223345",10000);
		//acc2.withdraw(10);//��
		acc2.deposit(100);  //��
		
		System.out.println(acc2.getAccountNumber());
		System.out.println(acc2.getBalance());
		
		System.out.println(acc.getAccountNumber());
		System.out.println(acc.getBalance());
		
	}
}