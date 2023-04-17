package Services;

import dao.DAOFactory;
import dao.EditoraDAO;
import java.util.ArrayList;
import model.Editora;

public class EditoraServicos {

    public void cadEditora(Editora cVO) {
        EditoraDAO vDAO = DAOFactory.getEditoraDAO();
        vDAO.cadastrarEditoraDAO(cVO);
    }
    public void atualizarEditora(Editora cVO) {
        EditoraDAO vDAO = DAOFactory.getEditoraDAO();
        vDAO.atualizarEditoraByDoc(cVO);
    }
public void deletarEditora(String cnpj) {
        EditoraDAO vDAO = DAOFactory.getEditoraDAO();
        vDAO.deletarEditoraDAO(cnpj);
    }
public Editora buscEditora(String cnpj) {
        EditoraDAO vDAO = DAOFactory.getEditoraDAO();
        return vDAO.getEditoraByDoc(cnpj);
    }
 public ArrayList<Editora> getEditoras() {
        EditoraDAO vDAO = DAOFactory.getEditoraDAO();
        return vDAO.getEditoras();

    }

}//fim main
