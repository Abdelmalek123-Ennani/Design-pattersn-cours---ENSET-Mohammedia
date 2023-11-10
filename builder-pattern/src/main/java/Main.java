import model.AccountStatus;
import model.AccountType;
import model.BankAccount;
import model.BankDirector;
import repository.AccountRepository;
import repository.AccountRepositoryImpl;
import util.JsonSerializer;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        JsonSerializer<BankAccount> bankAccountJsonSerializer = new JsonSerializer<>();
        AccountRepositoryImpl accountRepository = new AccountRepositoryImpl();
        accountRepository.populateData();
        List<BankAccount> bankAccounts =  accountRepository.searchAccount(bankAccount -> bankAccount.getType().equals(AccountType.SAVING_ACCOUNT));
        bankAccounts.stream().
                map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);

        /*
        System.out.println("----------------------------------------");
        BankAccount account =  accountRepository.findById(1L).orElse(null);
        if (account != null) {
            System.out.println(bankAccountJsonSerializer.toJson(account));
        }
         */
    }
}
