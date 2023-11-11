package ma.abdelmalek;

import ma.abdelmalek.model.AccountType;
import ma.abdelmalek.model.BankAccount;
import ma.abdelmalek.repository.AccountRepositoryImpl;
import ma.abdelmalek.util.JsonSerializer;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonSerializer<BankAccount> bankAccountJsonSerializer = new JsonSerializer<>();
        AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();


        // lancer des Threads
        for (int i=0 ; i<10 ; i++) {
            new Thread(() -> {
                accountRepository.populateData();
            }).start();
        }

        // accountRepository.populateData();
        System.out.println("Tapez a character");
        System.in.read();
       // List<BankAccount> bankAccounts =  accountRepository.searchAccount(bankAccount -> bankAccount.getType().equals(AccountType.SAVING_ACCOUNT));
        List<BankAccount> bankAccounts =  accountRepository.findAll();
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