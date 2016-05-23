package Lesson26.JDBC;


import java.nio.channels.Pipe;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CREATE TABLE product (id integer PRIMARY KEY, name varchar(20), category varchar(20), price integer);
 * INSERT INTO product VALUES
 * (1, 'Elephant', 'African animal', 1000000),
 * (2, 'Ostrich', 'Australian bird', 20000),
 * (3, 'Lion', 'African animal', 500000),
 * (4, 'Hipo', 'African animal', 850000);
 */
public class DBMain {

    private Connection connection = null;

    public DBMain(Connection connection) {
        this.connection = connection;
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

    public List<Product> findAllProducts() throws Exception {


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
    }

    public Product findById(int id) throws Exception {
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
    }


    public void createProduct(Product product) throws Exception {
        String sql =
                "INSERT INTO public.\"Product\" (id,name, category, proce) values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, product.getId());
        preparedStatement.setString(2, product.getName());
        preparedStatement.setString(3, product.getCategory());
        preparedStatement.setInt(4, product.getPrice());
        int rows = preparedStatement.executeUpdate();
        if (rows != 0) {
            System.out.println("insert");
        } else {
            System.out.println("not insert");
        }
        preparedStatement.close();

    }

    public void updatePriceByName(String name, int proce) throws Exception {
        // Statement statement = connection.createStatement();
        String sql = "UPDATE public.\"Product\" SET proce = ? Where name = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, proce);
        preparedStatement.setString(2, name);

        int rowsUpdated = preparedStatement.executeUpdate(sql);
         System.out.println("Updated " + rowsUpdated + " rows");

        // System.out.println("SQl " + sql);
        //  statement.close();


        preparedStatement.close();
    }

    public void delatePriceByName(int id) throws Exception {
        // Statement statement = connection.createStatement();
        String sql = "delete from \"Product\" Where id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int rows = preparedStatement.executeUpdate();

        System.out.println("rows delete " + rows);

        preparedStatement.close();
    }

    public static void main(String[] args) throws Exception {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        DBMain dbMain = new DBMain(connection);
        System.out.println(dbMain.findNameAndPrice());
        System.out.println(dbMain.findAllProducts());
        //  System.out.println(dbMain.findById(3));
        String s = String.format("my message is %s and %s, but my number is %d", "ASD", "QWE", 120);
        System.out.println(s);

        //  dbMain.updatePriceByName("Elephant", 9_999_999);

        dbMain.updatePriceByName("' OR ' '='", 9_999_999);
        dbMain.updatePriceByName("' OR true --", 9_999_999);


        //dbMain.createProduct(new Product(5, " Giraffe", "African animal", 6500));

        dbMain.delatePriceByName(2);

        connection.close();


    }




}


