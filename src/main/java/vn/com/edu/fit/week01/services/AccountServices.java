package vn.com.edu.fit.week01.services;

import vn.com.edu.fit.week01.models.Account;
import vn.com.edu.fit.week01.repositories.AccountRepository;

import java.util.List;

public class AccountServices {
    private final AccountRepository repository;
    public AccountServices() {
        repository = new AccountRepository();
    }

    public void insertAccount(Account account) {
       repository.add(account);

    }

    public void updateAccount(Account account) {
        repository.update(account);

    }

    public List<Account> getAll() {
        return repository.getAll();
    }

    public void deleteAccount(String id) {repository.deleteAccount(id);
    }
}
