public class Tester {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount(0.0,1,"help");
    BankAccount b2 = new BankAccount(542.32,942,"password");
    System.out.println(b1.getBalance());
    System.out.println(b1.getAccountID());
    System.out.println(b2.getBalance());
    System.out.println(b2.getAccountID());
  }
}
