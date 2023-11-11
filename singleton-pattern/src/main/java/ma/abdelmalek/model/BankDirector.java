package ma.abdelmalek.model;

public class BankDirector {
    // these two methode to learn how to implement "Builder pattern"
    public static BankAccount.AccountBuilder accountBuilder() {
        return new BankAccount.AccountBuilder();
    }
}
