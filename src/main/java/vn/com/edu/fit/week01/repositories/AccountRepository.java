package vn.com.edu.fit.week01.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import vn.com.edu.fit.week01.db.Connection;
import vn.com.edu.fit.week01.enums.Status;
import vn.com.edu.fit.week01.models.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository extends CRUDRepository<Account,String>{

    public List<Account> getAll() {
        List<Account> list = new ArrayList<>();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();

            list = em.createQuery("from Account", Account.class).getResultList();

            transaction.commit();
            return list;
        }catch (Exception e) {
            assert transaction != null;
            transaction.rollback();
            e.printStackTrace();
        }
        return list;
    }
    public boolean deleteAccount(String id) {
        EntityTransaction transaction = em.getTransaction();
        try {
            Account account = em.find(Account.class, id);

            if (account == null)
                return false;

            account.setStatus(Status.delete);
            transaction.begin();
            em.merge(account);
            transaction.commit();
            return true;
        }catch (Exception e) {
            assert transaction != null;
            transaction.rollback();
            e.printStackTrace();
        }
        return false;
    }

    public Account getAccountByID(String id) {
        EntityTransaction transaction = em.getTransaction();
        try {
            Account account = em.find(Account.class, id);
            transaction.begin();
            em.merge(account);
            transaction.commit();
            return account;
        }catch (Exception e) {
            assert transaction != null;
            transaction.rollback();
            e.printStackTrace();
        }
        return null;
    }



}
