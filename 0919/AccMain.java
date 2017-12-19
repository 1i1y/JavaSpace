public class AccMain{
    public static void main(String[] args){
        Account acc1 = new Account(1000,"000123-555666");
        acc1.withdraw(50);
        acc1.deposit(500);
        System.out.println(acc1.getAccountNumber());
        System.out.println(acc1.getBalance());
        
        Account acc2 = new Account(1000,"000123-555667");
        acc2.withdraw(10);
        acc2.deposit(100);
        System.out.println(acc2.getAccountNumber());
        System.out.println(acc2.getBalance());
    }
}