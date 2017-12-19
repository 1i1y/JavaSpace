//登入MySQL, 位址、庫名、帳號密碼

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class TestJDBC2{
    public static void main(String args[]) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/company?user=root&password=01234567";
        Connection conn = DriverManager.getConnection(url);
    }
}