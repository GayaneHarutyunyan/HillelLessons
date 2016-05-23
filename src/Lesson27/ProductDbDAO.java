package Lesson27;

import Lesson26.JDBC.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 23.05.2016.
 */
public class ProductDbDAO implements ProductDAO {
    private Connection connection = null;

    public ProductDbDAO() {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> findAll() {

        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT id,name,category, proce From public.\"Product\" ";
            ResultSet resultSet = statement.executeQuery(sql);

            List<Product> products = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String category = resultSet.getString("category");
                int price = resultSet.getInt("proce");
                Product product = new Product(id, name, category, price);
                products.add(product);
            }
            resultSet.close();
            statement.close();
            return products;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product findById(int id) {
        try {
            Statement statement = connection.createStatement();
            String sql =
                    "SELECT name, category, proce " +
                            " FROM public.\"Product\"" +
                            " WHERE id=" + id;
            ResultSet resultSet = statement.executeQuery(sql);
            Product result = null;
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String category = resultSet.getString("category");
                int price = resultSet.getInt("proce");
                result = new Product(id, name, category, price);
            }
            resultSet.close();
            statement.close();
            return result;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean create(Product product) {
        String sql =
                "INSERT INTO public.\"Product\" (id,name, category, proce) values(?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setString(3, product.getCategory());
            preparedStatement.setInt(4, product.getPrice());
            int rows = preparedStatement.executeUpdate();

            preparedStatement.close();
            return rows == 1;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Product product) {

        try {
            // Statement statement = connection.createStatement();
            String sql = "UPDATE public.\"Product\" SET name = ?, category = ?, proce = ? Where id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, product.getPrice());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setString(3, product.getCategory());
            preparedStatement.setInt(4, product.getId());

            preparedStatement.executeUpdate(sql);

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void delete(Product product) {
        try {
            // Statement statement = connection.createStatement();
            String sql = "delete from \"Product\" Where id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, product.getId());
            int rows = preparedStatement.executeUpdate();

            System.out.println("rows delete " + rows);

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
