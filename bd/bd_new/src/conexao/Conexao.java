package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String url = "jdbc:mysql://localhost:3306/exemplobd";
    private static final String user = "root";
    private static final String password = "tz951010";


    private static Connection conn;

    public static Connection getConexao() {

        if(conn == null) {
            try {
                conn = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) { 
                e.printStackTrace();
                return null; 
            }
        }
        return conn; 
    }
}
