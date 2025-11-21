package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa  {
    public static void main(String[] args) throws SQLException {

        Connection connection = fabricaConexao.getConection();
        Scanner scanner = new Scanner(System.in);

        System.out.print("qual o codigo do usuario que voce deseja excluir: ");
        int codigo = scanner.nextInt();

        String sql = "DELETE FROM pessoas WHERE codigo = ? ";

        PreparedStatement stmt = connection.prepareCall(sql);
        stmt.setInt(1, codigo);

        if (0 < stmt.executeUpdate()){
            System.out.println("usuario excluido com sucesso!!");
        }
        else {
            System.out.println("erro ao excluir usuario");

        }


        scanner.close();
        connection.close();
    }
}
