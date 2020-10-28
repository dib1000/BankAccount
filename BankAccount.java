public class BankAccount {
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(int a, String p) {
    balance = 0.0;
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
    if(amount>=0.0) {
      balance+=amount;
    }
    return amount>=0.0;
  }
  public boolean withdraw(double amount) {
    if (amount<0.0) {
      return false;
    }
    double oldBal = balance;
    if(amount<=balance) {
      balance-=amount;
    }
    return amount<=oldBal;
  }
  public String toString() {
    return "#"+accountID + "\t$" + balance;
  }
  private boolean authenticate(String password) {
    return this.password.equals(password);
  }
  public boolean transferTo(BankAccount other, double amount, String password) {
    if(authenticate(password) && withdraw(amount) ) {
      return other.deposit(amount);
    }
    else {
      return false;
    }
  }
}
