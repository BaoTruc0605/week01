package vn.com.edu.fit.week01.db;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connection {
    private final EntityManager em;
    private static Connection connection;
    private Connection(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("week01_lab_TranBaoTruc_20072261");
        em = emf.createEntityManager();
    }

    public EntityManager getEm() {
        return em;
    }
    public static Connection getInstance(){
        if(connection==null)
            connection = new Connection();
        return connection;
    }
}
