import java.sql.*;

public class SqlServer {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
        String connectionUrl =
                "jdbc:sqlserver://sqlserver.mssql.somee.com:1433;"
                        + "database=sqlserver;"
                        + "user=edangol_SQLLogin_1;"
                        + "password=qpnpz5zqqj;"
                        // + "encrypt=true;"
                        // + "trustServerCertificate=false;"
                        // + "loginTimeout=30;"
                        ;

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
           System.out.println(connection.getCatalog());
           System.out.println(connection.isClosed());
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}