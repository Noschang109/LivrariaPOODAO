package dao;

import services.ServicosFactory;

public class DAOFactory {

    private static ClienteDAO cDAO = new ClienteDAO();
    private static EditoraDAO eDAO = new EditoraDAO();
    private static LivroDAO livroDAO = new LivroDAO();
    private static VendaLivrosDAO vlDAO = new VendaLivrosDAO();

    public static ClienteDAO getClienteDAO() {
        return cDAO;
    }

    public static EditoraDAO getEditoraDAO() {
        return eDAO;
    }

    public static LivroDAO getLivroDAO() {
        return livroDAO;
    }

    public static VendaLivrosDAO getVendaLivrosDAO() {
        return vlDAO;
    }

}
