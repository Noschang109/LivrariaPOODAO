package dao;

<<<<<<< HEAD
import services.ServicosFactory;

public class DAOFactory {

    private static ClienteDAO cDAO = new ClienteDAO();
    private static EditoraDAO eDAO = new EditoraDAO();
    private static LivroDAO livroDAO = new LivroDAO();
    private static VendaLivrosDAO vlDAO = new VendaLivrosDAO();
=======
public class DAOFactory {

    private static ClienteDAO cDAO = new ClienteDAO();
>>>>>>> fddc258fbddb5e315f9edbd54aa53e332115913e

    public static ClienteDAO getClienteDAO() {
        return cDAO;
    }

<<<<<<< HEAD
    public static EditoraDAO getEditoraDAO() {
        return eDAO;
    }

    public static LivroDAO getLivroDAO() {
        return livroDAO;
    }

    public static VendaLivrosDAO getVendaLivrosDAO() {
        return vlDAO;
    }

=======
    private static EditoraDAO vDAO = new EditoraDAO();

    public static EditoraDAO getEditoraDAO() {
        return vDAO;
    }
    private static LivroDAO bDAO = new LivroDAO();

    public static LivroDAO getLivroDAO() {
        return bDAO;
    }
>>>>>>> fddc258fbddb5e315f9edbd54aa53e332115913e
}
