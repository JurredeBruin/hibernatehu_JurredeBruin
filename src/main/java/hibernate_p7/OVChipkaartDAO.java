package hibernate_p7;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface OVChipkaartDAO {
    boolean save(OVChipkaart ovChipkaart);
    boolean update(OVChipkaart ovChipkaart);
    boolean delete(OVChipkaart ovChipkaart);

    OVChipkaart findById(int id);
    List<OVChipkaart> findAll();


}

