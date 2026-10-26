import java.util.ArrayList;

// Den här klassen håller reda på alla konton
public class AccountRegister {

    private ArrayList<Account> accounts = new ArrayList<>();

    // Skapar ett nytt konto och lägger det i listan
    public void createAccount(String owner, double balance) {
        Account account = new Account(owner, balance);
        accounts.add(account);
    }

    // Visar alla konton
    public void showAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("Det finns inga konton.");
            return;
        }

        for (Account account : accounts) {
            System.out.println("Ägare: " + account.getOwner()
                    + " | Saldo: " + account.getBalance() + " kr");
        }
    }

    // Söker efter ett konto med ägarens namn
    public Account findAccount(String owner) {
        for (Account account : accounts) {
            if (account.getOwner().equalsIgnoreCase(owner)) {
                return account;
            }
        }

        return null;
    }
}
