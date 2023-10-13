package vn.com.edu.fit.week01.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vn.com.edu.fit.week01.db.Connection;
import vn.com.edu.fit.week01.models.Account;

import java.util.ArrayList;
import java.util.List;

public class CRUDRepository<T,K>{
    protected final EntityManager em;

    public CRUDRepository() {
        em = Connection.getInstance().getEm();
    }
    public boolean add(T t){
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(t);
            transaction.commit();
            return true;
        }catch (Exception e){
            assert transaction != null;
            transaction.rollback();
            e.printStackTrace();
        }
        return false;
    }
    public boolean update(T t){
        EntityTransaction transaction = em.getTransaction();
        try {

            transaction.begin();
            em.merge(t);
            transaction.commit();
            return true;
        }catch (Exception e){
            assert transaction != null;
            transaction.rollback();
            e.printStackTrace();
        }
        return false;
    }




}
