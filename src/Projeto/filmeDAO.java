import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class filmeDAO{

    public Filme create(Filme filme) throws SQLException{
        String sql = "INSERT INTO filme (id, titulo, duracao, genero, classificacaoInd, sinopse)
        VALUES (?, ?, ?, ?, ?, ?);";
    
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection);
        {
            statement.setInt(1, filme.getID());
            statement.setString(2, filme.getTitulo());
            statement.setINT(3, filme.getDuracao());
            statement.setString(4, filme.getGenero());
            statement.setInt(5, filme.getClassificacoInd());
            statement.setString(6, filme.getSinopse());
            statement.executeUpdate();
        }
    }

    public Filme update(Filme filme) throws SQLException {
        String sql = """
            UPDATE filme 
            SET titulo = ?, duracao = ?, genero = ?, classificacaoInd = ?, sinopse = ?
            WHERE id = ?;
        """;

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
             statement.setINT(1, filme.getID());
            statement.setString(2, filme.getTitulo());
            statement.setINT(3, filme.getDuracao());
            statement.setString(4, filme.getGenero());
            statement.setINT(5, filme.getClassificacoInd());
            statement.setString(6, filme.getSinopse());

            
            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                return filme;
            }
            
            return null;

        } catch (SQLException e) {
            return null;
        }
    }

     public void delete(Integer id) {
        String sql = "DELETE FROM filme WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Filme filme) {
        delete(filme.getId());
    }

    public Filme findById(Integer id) {
        String sql = "SELECT * FROM filme WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToFilme(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public List<Filme> findAll() {
        String sql = "SELECT * FROM filme;";
        List<Filme> filme = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while(rs.next()) {
                alunos.add(resultSetToFilme(rs));
            }

            return filme;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } 
    }

    private Aluno resultSetToAluno(ResultSet rs) throws SQLException {
        return new Aluno(
            rs.getInt("id"),
            rs.getString("titulo"),
            rs.getINT("duracao"),
            rs.getString("genero"),
            rs.getINT("classificacaoInd")
            rs.getString("sinopse"),
        );
    }
}
