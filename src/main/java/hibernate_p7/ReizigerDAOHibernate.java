package hibernate_p7;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ReizigerDAOHibernate implements ReizigerDAO {
    private Session session;

    public void setSession(Session session) {
        if (this.session == null) {
            this.session = session;
        }
    }

    @Override
    public boolean save(Reiziger reiziger) {
        Transaction transaction;
        try {
            transaction = session.beginTransaction();
            session.persist(reiziger);
            transaction.commit();

            return true;
        } catch(Exception e) {
            System.err.println( e.getMessage() );
            return false;
        }
    }

    @Override
    public boolean update(Reiziger reiziger) {
        Transaction transaction;
        try {
            transaction = session.beginTransaction();
            session.merge(reiziger);
            transaction.commit();

            return true;
        } catch(Exception e) {
            System.err.println( e.getMessage() );
            return false;
        }
    }

    @Override
    public boolean delete(Reiziger reiziger) {
        Transaction transaction;
        try {
            transaction = session.beginTransaction();
            session.remove(reiziger);
            transaction.commit();

            return true;
        } catch(Exception e) {
            System.err.println( e.getMessage() );
            return false;
        }
    }

    @Override
    public List<Reiziger> findAll() {
        String hql = "FROM Reiziger";
        Query query = session.createQuery(hql);
        List results = query.list();

        return results;
    }

    @Override
    public Reiziger findById(int id) {
        String hql = "FROM Reiziger AS A WHERE A.id = :ID";
        Query query = session.createQuery(hql);
        query.setParameter("ID",id);
        List results = query.list();

        if (results.size() == 0) {
            return null;
        }

        return (Reiziger) results.get(0);
    }

    @Override
    public List<Reiziger> findByGeboorteDatum(String dateString) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date = formatter.parse(dateString);

            String hql = "FROM Reiziger AS A WHERE A.geboorteDatum = :date";
            Query query = session.createQuery(hql);
            query.setParameter("date", date );
            List results = query.list();

            return results;
        } catch(Exception err) {
            System.err.println( err.getMessage() );
            return null;
        }

    }
}