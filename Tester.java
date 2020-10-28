public class Tester {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount(0.0,1,"help");
    BankAccount b2 = new BankAccount(542.32,942,"password");
    BankAccount b3 = new BankAccount(-19.2,33,"yikes");
    b2.setPassword("3jfdw04jdf2jif");
    System.out.println(b1.deposit(42.1)); //should return true
    System.out.println(b2.deposit(1.0)); //should return true
    System.out.println(b3.deposit(-42.1)); //should return false
    System.out.println(b1.getBalance()); //should be 1
    System.out.println(b1.getAccountID()); //should be 1
    System.out.println(b1.toString());
    System.out.println(b2.getBalance()); //should be 543.32
    System.out.println(b2.getAccountID()); //should be 942
    System.out.println(b2.toString());
    System.out.println(b3.getBalance()); //should be same as top
    System.out.println(b3.getAccountID()); //should be 33
    System.out.println(b3.toString());
    //System.out.println(b2.getPassword()); (testing setPassword)
    System.out.println();
    System.out.println(b1.withdraw(42.2)); //should return false
    System.out.println(b2.withdraw(1.0)); //should return true
    System.out.println(b3.withdraw(-42.1)); //should return false
    System.out.println(b1.getBalance()); //should be 42.1
    System.out.println(b2.getBalance()); //should be same balance as line 4
    System.out.println(b3.getBalance()); //balance should not change
  }
}
