package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Livro;

public class LivroDAO {

    public void cadastrarLivroDAO(Livro cVO) {
        //busca conexão com o BD
        Connection con = Conexao.getConexao();

        try {
            //cria espaço de trabalho SQl, é a área no Java onde
            //vamo executar os scripts SQL
            Statement stat = con.createStatement();

            String sql;
            sql = "insert into livros values (null,?,?,null,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, cVO.getIdLivro());
            pst.setString(2, cVO.getTitulo());
            pst.setString(3, cVO.getAutor());
            pst.setString(4, cVO.getAssunto());
            pst.setString(5, cVO.getIsbn());
            pst.setInt(6, cVO.getEstoque());
            pst.setFloat(7, cVO.getPreco());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar Livro!\n"
                    + ex.getMessage());
        }

    }

    public ArrayList<Livro> getLivrosDAO() {
        Connection con = Conexao.getConexao();
        ArrayList<Livro> livros = new ArrayList<>();
        try {
            Statement stat = con.createStatement();
            String sql = "select * from livros";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                Livro d = new Livro();
                //lado do java |x| (lado do banco)
                d.setIdLivro(rs.getInt("idlivro"));
                d.setTitulo(rs.getString("titulo"));
                d.setAutor(rs.getString("autor"));
                d.setAssunto(rs.getString("assunto"));
                d.setIsbn(rs.getString("isbn"));
                d.setEstoque(1234456768);
                d.setPreco(1234566782);
                livros.add(d);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Listar Livro!\n"
                    + ex.getMessage());
        }
        return livros;
    }//fim do listar

    public Livro getLivroByDoc(String isbn) {
        Livro d = new Livro();
        try {
            Connection con = Conexao.getConexao();
            Statement stat = con.createStatement();
            String sql = "select * from livros where isbn = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, isbn);
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                //lado do java |x| (lado do banco)
                d.setIdLivro(rs.getInt("idlivro"));
                d.setTitulo(rs.getString("titulo"));
                d.setAutor(rs.getString("autor"));
                d.setAssunto(rs.getString("assunto"));
                d.setIsbn(rs.getString("isbn"));
                d.setEstoque(123456789);
                d.setPreco(1234543);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar CPF!\n"
                    + ex.getMessage());
        }
        return d;
    }

    public void deletarLivroDAO(String isbn) {
       Connection con = Conexao.getConexao();
        try {
            String sql = "delete from livros where isbn = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, isbn);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao Deletar ISBN!\n"
                    + ex.getMessage());
        }
    }//fimDeletar
    public void atualizarLivroByDoc(Livro cVO){
        Connection con = Conexao.getConexao();
        try {
            String sql = "update cliente set titulo = ?, autor = ?, assunto = ?, isbn = ? , estoque = ?"
                    + " where preco = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getTitulo());
            pst.setString(2, cVO.getAutor());
            pst.setString(3, cVO.getAssunto());
            pst.setString(4, cVO.getIsbn());
            pst.setInt(5, cVO.getEstoque());
            pst.setFloat(6,cVO.getPreco());
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao Atualizar Livro!\n"
                    + ex.getMessage());
        }
    }


}//fimlivroDAO
