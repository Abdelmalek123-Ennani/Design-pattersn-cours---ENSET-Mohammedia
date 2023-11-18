package ma.abdelmalek;

import ma.abdelmalek.model.AccountStatus;
import ma.abdelmalek.model.AccountType;
import ma.abdelmalek.model.BankAccount;
import ma.abdelmalek.model.Customer;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountId(1L);
        bankAccount.setCurrency("MAD");
        bankAccount.setType(AccountType.CURRENT_ACCOUNT);
        bankAccount.setStatus(AccountStatus.ACTIVATED);
        bankAccount.setCustomer(new Customer(1l , "Abdelmalek"));

        /*
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setAccountId(bankAccount.getAccountId());
        bankAccount1.setCurrency(bankAccount.getCurrency());
        bankAccount1.setType(bankAccount.getType());
        bankAccount1.setStatus(bankAccount.getStatus());
         */

        BankAccount bankAccount2 = bankAccount.clone();


        System.out.println(bankAccount);
        System.out.println(bankAccount2);


        System.out.println("==================");
        bankAccount.getCustomer().setName("Karim");
        System.out.println("Account 1 : " + bankAccount);
        System.out.println("Account 2 : " + bankAccount2);
    }
}
