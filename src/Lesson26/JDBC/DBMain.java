package Lesson26.JDBC;


import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DBMain {

    private Connection connection = null;

    public DBMain(Connection connection) {
        this.connection = connection;
    }


    public List<Product> findAllProducts() throws Exception {
        Statement statement = connection.createStatement();
        String sql = "SELECT id, name,category, proce From public.\"Product\" ";
        ResultSet resultSet = statement.executeQuery(sql);
        List<Product> product = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("proce");
            Product product1 = new Product(id,name,category,price);
            product.add(product1);
        }

        resultSet.close();
        statement.close();
        return product;

    }

    public Map<String, Integer> findNameAndPrice() throws SQLException {

        Statement statement = connection.createStatement();
        String sql = "SELECT name, proce From public.\"Product\" ";
        ResultSet resultSet = statement.executeQuery(sql);
        Map<String, Integer> nameAndPrice = new HashMap<>();

        while (resultSet.next()) {
            String name = resultSet.getString(1);
            int price = resultSet.getInt(2);
            nameAndPrice.put(name, price);
            //  System.out.println(name + " " + price);
        }

        resultSet.close();
        statement.close();


        return nameAndPrice;
    }

    public static void main(String[] args) throws Exception {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");

        Connection  connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        DBMain dbMain = new DBMain(connection);
        System.out.println(dbMain.findAllProducts());
        System.out.println("\n");
        System.out.println(dbMain.findNameAndPrice());

        connection.close();

    }
}
