package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        Connection conection = fabricaConexao.getConection();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        PreparedStatement stmt = conection.prepareStatement(sql);
        stmt.setString(1, nome);

        stmt.execute();

        System.out.println("cadastro realizado com sucesso!!!");

        scanner.close();
        conection.close();

    }
}
