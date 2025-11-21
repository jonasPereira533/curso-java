package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class fabricaConexao {

    public static Connection getConection() {
        try {
        final String url = "jdbc:mysql://localhost/curso_java";
        final String usuario = "root";
        final String senha = "Jps141006";
        return DriverManager.getConnection(url, usuario, senha);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
