package Projeto;

import java.sql.SQLException;

public class main {

    public static void main(String[] args) throws SQLException{

        FilmeDAO filmeDAO = new filmeDAO();

        Filme filme = new filme ("1", "openhimer", "125", "drama", "18", "nekbgjhegebvhefgbejhmvbeagjuvfmjhevg");

        Filme filmeCriado = filmeDAO.create(filme);

        System.out.println(filmeCriado.getID());

        System.out.println(filmeDAO.findById(1))
    }
}