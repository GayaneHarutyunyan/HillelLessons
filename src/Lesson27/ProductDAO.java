package Lesson27;

import Lesson26.JDBC.Product;

import java.util.List;

/**
 * Created by User on 23.05.2016.
 */
public interface ProductDAO {

    List<Product> findAll();

    Product findById(int id);

    boolean create(Product product);

    void update(Product product);

    void delete(Product product);
}
