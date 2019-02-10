public class Test{

    public static void main(String[] args) {
        Account acct1 = new Account(100); //Declare and instation object var named acct1
        Account acct2 = new Account(200);
        double balance = acct1.checkBalance();
        balance = acct2.checkBalance();
        acct1.setName("Alec");
        acct2.setName("Merv");
        acct1.deposit(100);
        acct1.withdraw(25);
        acct2.deposit(25);
        System.out.println(acct1.getName() + " "+ acct1.checkBalance() + " " + acct1.getCount());
       
        System.out.println(acct2.getName() + " " + acct2.checkBalance() + " " + acct2.getCount());

        
    }
}