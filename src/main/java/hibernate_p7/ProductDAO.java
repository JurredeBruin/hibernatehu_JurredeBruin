package hibernate_p7;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface ProductDAO {
    boolean save(Product product);
    boolean update(Product product);
    boolean delete(Product product);

    Product findById(int id);
    List<Product> findAll();

}
