
package dao;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Editora;

public class EditoraDAO {
    public void cadastrarEditoraDAO(Editora cVO) {
        //busca conexão com o BD
        Connection con = Conexao.getConexao();

        try {
            //cria espaço de trabalho SQl, é a área no Java onde
            //vamo executar os scripts SQL
            Statement stat = con.createStatement();

            String sql;
            sql = "insert into Editoras values (null,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNmEditora());
            pst.setString(2, cVO.getEndereco());
            pst.setString(3, cVO.getTelefone());
            pst.setString(4, cVO.getGerente());
            pst.setString(5, cVO.getCnpj());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar Editora!\n"
                    + ex.getMessage());
        }
    }//fim cadastrar
    public ArrayList<Editora> getEditoras() {
        Connection con = Conexao.getConexao();
         ArrayList<Editora> editoras = new ArrayList<>();
        try {
            Statement stat = con.createStatement();
            String sql = "select * from Editoras";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                Editora c = new Editora();
                //lado do java |x| (lado do banco)
                c.setIdEditora(rs.getInt("ideditora"));
                c.setGerente(rs.getString("gerente"));
                c.setCnpj(rs.getString("cnpj"));
                c.setEndereco(rs.getString("endereco"));
                c.setTelefone(rs.getString("telefone"));
                c.setNmEditora(rs.getString("nomeEditora"));
                editoras.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Listar Editora!\n"
                    + ex.getMessage());
        }
         return editoras;
    }//fim do listar

public Editora getEditoraByDoc(String cnpj) {
        Editora c = new Editora();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from editoras where cnpj = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cnpj);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                //lado do java |x| (lado do banco)
                c.setIdEditora(rs.getInt("ideditora"));
                c.setNmEditora(rs.getString("nomeEditora"));
                c.setEndereco(rs.getString("Endereco"));
                c.setTelefone(rs.getString("telefone"));
                c.setGerente(rs.getString("gerente"));
                c.setCnpj(rs.getString("cnpj"));
                
                
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar CNPJ!\n"
                    + ex.getMessage());
        }
        
        return c;
    }

    public void deletarEditoraDAO(String cnpj) {
       Connection con = Conexao.getConexao();
        try {
            String sql = "delete from editoras where cnpj = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cnpj);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao Deletar CNPJ!\n"
                    + ex.getMessage());
        }
    }//fimDeletar

public void atualizarEditoraByDoc(Editora cVO){
        Connection con = Conexao.getConexao();
        try {
            String sql = "update editora set cnpj = ?, endereco = ?, telefone = ? "
                    + " where cnpj = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getCnpj());
            pst.setString(2, cVO.getNmEditora());
            pst.setString(3, cVO.getEndereco());
            pst.setString(4, cVO.getTelefone());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao Atualizar Editora!\n"
                    + ex.getMessage());
        }
    }
}
