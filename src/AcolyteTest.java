import java.sql.*;
import java.util.concurrent.Callable;

public class AcolyteTest{

    public static Statement stat;
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:My_cats.db");
            System.out.println("Connected");
            stat = connection.createStatement();
            stat.execute("CREATE TABLE if not exists 'types' ('id' INTEGER PRIMARY KEY AUTOINCREMENT , 'type' text NOT NULL);");










            } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        addType("American cat");
        addType("Australian cat");
        addType("Amerecan hard cat");



    }

        public static void addType(String type) throws SQLException {
            stat.execute("INSERT INTO 'types' ('type') VALUES('"+type+"');");
        }
}
