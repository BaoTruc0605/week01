package vn.com.edu.fit.week01.services;

import vn.com.edu.fit.week01.models.Account;
import vn.com.edu.fit.week01.repositories.AccountRepository;

public class AccountServices {
    private final AccountRepository repository;
    public AccountServices() {
        repository = new AccountRepository();
    }

    public void insertAccount(Account account) {
       repository.add(account);

    }
}
