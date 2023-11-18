package ma.abdelmalek.repository;


import ma.abdelmalek.model.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface AccountRepository {
    BankAccount save(BankAccount bankAccount);
    List<BankAccount> findAll();

    // optional means: either returns an Account or nothing
    Optional<BankAccount> findById(long id);

    /*
    * In Java, a Predicate is just a function, that represents a predefined condition.
    * Given a stream of objects,
    * often we need to check whether objects match specific criteria
    * */
    List<BankAccount> searchAccount(Predicate<BankAccount> predicate);
    BankAccount update(BankAccount account);
    void deleteById(Long id);

}
