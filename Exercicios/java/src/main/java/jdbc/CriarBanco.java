package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {

//        final String url = "jdbc:mysql://localhost";
//        final String usuario = "root";
//        final String senha = "Jps141006";
//
//        Connection conexao = DriverManager
//                .getConnection(url, usuario, senha);
        Connection conection = fabricaConexao.getConection();

        Statement stmt = conection.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("banco criado com sucesso!!");
        conection.close();
    }
}
