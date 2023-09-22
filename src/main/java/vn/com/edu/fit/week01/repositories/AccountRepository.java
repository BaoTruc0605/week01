package vn.com.edu.fit.week01.repositories;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import vn.com.edu.fit.week01.db.Connection;

public class AccountRepository {
    private final EntityManager em = Connection.getInstance().getEm();

}
