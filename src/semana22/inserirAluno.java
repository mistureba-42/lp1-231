package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class inserirAluno {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        int id = 1;
        String nome = "Maria da Silva";
        String email = "maria@email.com";
        boolean ativo = true;


        String sql = "INSERT INTO alunos VALUES (?, ?, ?, ?);";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.setString(2, nome);
        statement.setString(3, email);
        statement.setBoolean(4, ativo);

        statement.executeUpdate();

        statement.close();
        connection.close();
    }
}