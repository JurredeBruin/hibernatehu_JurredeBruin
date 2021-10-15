package hibernate_p7;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface ReizigerDAO {
    boolean save(Reiziger reiziger);
    boolean update(Reiziger reiziger);
    boolean delete(Reiziger reiziger);
    Reiziger findById(int id);
    List<Reiziger> findByGeboorteDatum(String datum);
    List<Reiziger> findAll();
}
