public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.00);
        ATM atm = new ATM(account);
        atm.start();
    }
}
