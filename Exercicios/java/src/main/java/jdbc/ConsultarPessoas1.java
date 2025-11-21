package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

    public static void main(String[] args) throws SQLException {

        Connection conexao = fabricaConexao.getConection();

        String sql = "SELECT * FROM pessoas";

        Statement stmt = conexao.createStatement();
        ResultSet resltado = stmt.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

        while (resltado.next()){
            int codigo = resltado.getInt("codigo");
            String nome = resltado.getNString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p:pessoas){
            System.out.println(p.getCodigo()+ " -> " + p.getNome());
        }

        stmt.close();
        conexao.close();

    }
}
