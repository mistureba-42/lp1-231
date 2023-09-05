package semana22;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {

    public static void main(String[] args) throws SQLException {
        //1 abrir a coneao
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        //2 executar a consulta e usar os resultados
        String sql = "CREATE TABLE alunos(id INT PRIMARY KEY, nome VARCHAR(100), email VARCHAR(255), ativo BOOL);";
        Statement statement = connection.createStatement();
        statement.execute(sql);
        

        //3 fechar conexao
        statement.close();
        connection.close();
    }
}