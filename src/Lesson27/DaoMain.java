package Lesson27;

import Lesson26.JDBC.Product;

/**
 * Created by User on 23.05.2016.
 */
public class DaoMain {

    public static void main(String[] args) {
        ProductDAO productDAO = new ProductMamaryDAO();
      Product product= productDAO.findById(3);
        System.out.println(product);

    product.setName("Crocodile");
        productDAO.update(product);
        System.out.println(productDAO.findAll());

    }
}
