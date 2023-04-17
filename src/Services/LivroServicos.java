
package Services;
import dao.LivroDAO;
import dao.DAOFactory;
import java.util.ArrayList;
import model.Livro;


public class LivroServicos {
    public void cadLivro(Livro cVO) {
        LivroDAO zDAO = DAOFactory.getLivroDAO();
        zDAO.cadastrarLivroDAO(cVO);
    }
public void atualizarLivro(Livro cVO) {
        LivroDAO bDAO = DAOFactory.getLivroDAO();
        bDAO.atualizarLivroByDoc(cVO);
    }
public void deletarLivro(String isbn) {
        LivroDAO bDAO = DAOFactory.getLivroDAO();
        bDAO.deletarLivroDAO(isbn);
    }
public Livro buscaLivroByDoc(String isbn) {
        LivroDAO bDAO = DAOFactory.getLivroDAO();
        return bDAO.getLivroByDoc(isbn);
    }
 public ArrayList<Livro> getLivros() {
        LivroDAO bDAO = DAOFactory.getLivroDAO();
        return bDAO.getLivrosDAO();

    }
}
