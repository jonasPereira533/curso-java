package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.ResultSet;

public class ConsultarPessoasWhere {
    public static void main(String[] args) throws SQLException {

        Connection conexao = fabricaConexao.getConection();
        Scanner scanner = new Scanner(System.in);

        System.out.print("o que deseja buscar: ");
        String consulta = scanner.nextLine();

        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + consulta + "%");

        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()){
            String nome = resultado.getNString("nome");
            int codigo = resultado.getInt("codigo");
            pessoas.add(new Pessoa(codigo, nome));
        }
        for (Pessoa p: pessoas ){
            System.out.println(p.getCodigo() + "->" + p.getNome());

        }

        scanner.close();
        conexao.close();
        stmt.close();
    }
}
