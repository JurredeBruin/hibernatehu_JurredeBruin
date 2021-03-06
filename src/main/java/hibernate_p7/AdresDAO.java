package hibernate_p7;

import java.sql.SQLException;
import java.util.List;

public interface AdresDAO {
    boolean save(Adres adres);
    boolean update(Adres adres);
    boolean delete(Adres adres);

    Adres findById(int id);
    List<Adres> findAll();
}
