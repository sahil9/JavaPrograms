package academy.learnprogramming;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public int getPhoneNumber(){
        return  phoneNumber;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds(int amount) {
        this.balance += amount;
        System.out.println(amount+" deposited");
    }
    public void withdrawFunds(int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println(amount+" withdrawn");
        }else{
            System.out.println("Insufficient funds");
        }
    }

}
