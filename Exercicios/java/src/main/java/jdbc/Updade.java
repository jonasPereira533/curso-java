package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Updade {

    public static void main(String[] args) throws SQLException {

        Connection conexao = fabricaConexao.getConection();
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual o codigo da pessoa que voce gostaria de alterar: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("qual o novo nome: ");
        String nome = scanner.nextLine();



        String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        String sql2 = "select * from pessoas where codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome );
        stmt.setInt(2, codigo);

        int linhasAfetadas = stmt.executeUpdate();

        PreparedStatement stmt2 = conexao.prepareStatement(sql2);
        stmt2.setInt(1, codigo);

        ResultSet resultado = stmt2.executeQuery();


        while (resultado.next()){
            System.out.println(resultado.getInt("codigo") + " -> " + resultado.getString("nome"));
        }

        System.out.println("cadastro alterado com sucesso !!!");
    }
}
