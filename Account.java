public class Account{
    //Atributes
    private double balance;
    private int inc;
    private String name;

    public Account(double startBalance){
        this.balance = startBalance;
    }
    public Account(String Cname, double startBal){
        this.name = Cname;
        this.balance = startBal;
    }



    //Method that returns the account bal
    //Accessor
    public double checkBalance(){
        return this.balance;
    }


    //Method to deposit an amount to the account
    public void deposit(double amount){
        this.balance += amount;
        inc ++;
    }
    //Method to withdraw
    //Mutator
    public void withdraw(double amount){
        this.balance = this.balance-amount;
        inc++;
    }
    //Accessor
    public int getCount(){
        return this.inc;
    }

    public void setName(String aname){
        this.name = aname;
    }
    public String getName(){
        return this.name;
    }


}