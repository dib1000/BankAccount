public class BankAccount {
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(double b, int a, String p) {
    balance = b;
    accountID = a;
    password = p;
  }
  public double getBalance() {
    return balance;
  }
  public int getAccountID() {
    return accountID;
  }
  //public String getPassword() { //for testing setPassword
    //return password;
  //}
  public void setPassword(String newPass) {
    password = newPass;
  }
  public boolean deposit(double amount) {
    if(balance>=0.0) {
      balance+=amount;
    }
    return balance>=0.0;
  }
  public boolean withdraw(double amount) {
    double oldBal = balance;
    if(amount<=balance) {
      balance-=amount;
    }
    return oldBal!=balance;
  }
}
