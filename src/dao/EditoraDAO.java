<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

=======

package dao;
>>>>>>> fddc258fbddb5e315f9edbd54aa53e332115913e
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Editora;

<<<<<<< HEAD
/**
 *
 * @author jbferraz
 */
public class EditoraDAO {

    public void cadastrarEditoraDAO(Editora eVO) {
        try {
            //busca conexão com o BD
            Connection con = Conexao.getConexao();
            //cria espaço de trabalho SQl, é a área no Java onde
            //vamo executar os scripts SQL
            String sql;
            sql = "insert into editoras values (null, ?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, eVO.getNmEditora());
            pst.setString(2, eVO.getCnpj());
            pst.setString(3, eVO.getEndereco());
            pst.setString(4, eVO.getTelefone());
            pst.setString(5, eVO.getGerente());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n"
                    + ex.getMessage());
        }
    }//fim cadastrar

    public ArrayList<Editora> getEditorasDAO() {
        ArrayList<Editora> editoras = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            Statement stat = con.createStatement();
            String sql = "select * from editoras";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                Editora e = new Editora();
                //lado do java |x| (lado do banco)
                e.setIdEditora(rs.getInt("ideditora"));
                e.setNmEditora(rs.getString("nomeEditora"));
                e.setCnpj(rs.getString("cnpj"));
                e.setEndereco(rs.getString("endereco"));
                e.setTelefone(rs.getString("telefone"));
                e.setGerente(rs.getString("gerente"));
                editoras.add(e);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Listar!\n"
                    + ex.getMessage());
        }
        return editoras;
    }//fim do listar

    public Editora getEditoraByDoc(String cnpj) {
        Editora e = new Editora();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from editoras where cnpj = ?;";
=======
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
>>>>>>> fddc258fbddb5e315f9edbd54aa53e332115913e
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cnpj);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                //lado do java |x| (lado do banco)
<<<<<<< HEAD
                e.setIdEditora(rs.getInt("ideditora"));
                e.setNmEditora(rs.getString("nomeEditora"));
                e.setCnpj(rs.getString("cnpj"));
                e.setEndereco(rs.getString("endereco"));
                e.setTelefone(rs.getString("telefone"));
                e.setGerente(rs.getString("gerente"));
=======
                c.setIdEditora(rs.getInt("ideditora"));
                c.setNmEditora(rs.getString("nomeEditora"));
                c.setEndereco(rs.getString("Endereco"));
                c.setTelefone(rs.getString("telefone"));
                c.setGerente(rs.getString("gerente"));
                c.setCnpj(rs.getString("cnpj"));
                
                
>>>>>>> fddc258fbddb5e315f9edbd54aa53e332115913e
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar CNPJ!\n"
                    + ex.getMessage());
        }
<<<<<<< HEAD
        return e;
    }

    public void deletarEditoraDAO(String cnpj) {
        try {
            Connection con = Conexao.getConexao();
=======
        
        return c;
    }

    public void deletarEditoraDAO(String cnpj) {
       Connection con = Conexao.getConexao();
        try {
>>>>>>> fddc258fbddb5e315f9edbd54aa53e332115913e
            String sql = "delete from editoras where cnpj = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cnpj);
            pst.executeUpdate();
        } catch (SQLException ex) {
<<<<<<< HEAD
            System.out.println("Erro ao deletar CNPJ!\n"
                    + ex.getMessage());
        }
    }//fim deletarEditora

    public void atualizaEditoraByDoc(Editora eVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update editoras set nomeEditora = ?, endereco = ?, telefone = ?, gerente = ? "
                    + "where cnpj = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, eVO.getNmEditora());
            pst.setString(5, eVO.getCnpj());
            pst.setString(2, eVO.getEndereco());
            pst.setString(3, eVO.getTelefone());
            pst.setString(4, eVO.getGerente());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar CNPJ!\n"
=======
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
>>>>>>> fddc258fbddb5e315f9edbd54aa53e332115913e
                    + ex.getMessage());
        }
    }
}
