package ma.abdelmalek.repository;


import ma.abdelmalek.model.AccountStatus;
import ma.abdelmalek.model.AccountType;
import ma.abdelmalek.model.BankAccount;
import ma.abdelmalek.model.BankDirector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountRepositoryImpl implements AccountRepository {


    // Singleton Pattern
    private static final AccountRepositoryImpl accountRepository;
    // execution de ce block au moment de chargement de la class au memoir
    // le premier block qui s'execute dans la class c'est le block static
    static {
        System.out.println("Singleton Instantiation");
        accountRepository = new AccountRepositoryImpl();
    }


    // un cosntructure privé => cette class ne peut pas instatier que dedant la class
    private AccountRepositoryImpl() {

    }

    // store accounts in a collection of type "MAP"
    private Map<Long, BankAccount> bankAccountMap = new HashMap<>();
    private long accountsCount = 0;
    @Override
    public synchronized BankAccount save(BankAccount bankAccount) {
        // synchronize l'objet
        /*synchronized (this) {
            Long accountId = ++accountsCount; // Critical Zone
            bankAccount.setAccountId(accountId);
            bankAccountMap.put(accountId, bankAccount);
        }
        * je comment ce block car j'ai ajouter synchronized a coté de public pour cette methode
        */
        // this syncronisation pour résoude le problem de Threads

        Long accountId = ++accountsCount; // Critical Zone
        bankAccount.setAccountId(accountId);
        bankAccountMap.put(accountId, bankAccount);
        return bankAccount;
    }

    @Override
    public List<BankAccount> findAll() {
        // change Type from collection to List
        return bankAccountMap.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(long id) {
        BankAccount bankAccount = bankAccountMap.get(id);
        if (bankAccount == null) return Optional.empty();
        return Optional.of(bankAccount);
    }

    @Override
    public List<BankAccount> searchAccount(Predicate<BankAccount> predicate) {
        return bankAccountMap.values().stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public BankAccount update(BankAccount account) {
        bankAccountMap.put(account.getAccountId() , account);
        return account;
    }

    @Override
    public void deleteById(Long id) {
        bankAccountMap.remove(id);
    }

    public void populateData() {
        for (int i=0; i <10; i++) {
            BankAccount bankAccount = BankDirector.accountBuilder()
                    .balance(1000+Math.random()*90000)
                    .type(Math.random() > 0.5 ? AccountType.SAVING_ACCOUNT : AccountType.CURRENT_ACCOUNT)
                    .status(Math.random()>0.5 ? AccountStatus.CREATED : AccountStatus.ACTIVATED)
                    .currency(Math.random()>0.5 ?  "MAD" : "USD")
                    .build();
            save(bankAccount);
        };

        System.out.println("********************************");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Account count = " + accountsCount);
        System.out.println("Size  = " + bankAccountMap.values().size());

    }


    public static AccountRepositoryImpl getInstance() {
        return accountRepository;
    }
}
