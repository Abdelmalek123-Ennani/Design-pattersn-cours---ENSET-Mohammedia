package repository;

import model.AccountStatus;
import model.AccountType;
import model.BankAccount;
import model.BankDirector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountRepositoryImpl implements AccountRepository {

    // store accounts in a collection of type "MAP"
    private Map<Long,BankAccount> bankAccountMap = new HashMap<>();
    private long accountsCount = 0;
    @Override
    public BankAccount save(BankAccount bankAccount) {
        Long accountId = ++accountsCount;
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
    }
}
