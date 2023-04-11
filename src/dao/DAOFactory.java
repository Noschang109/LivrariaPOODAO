package dao;

public class DAOFactory {

    private static ClienteDAO cDAO = new ClienteDAO();

    public static ClienteDAO getClienteDAO() {
        return cDAO;
    }

    private static EditoraDAO vDAO = new EditoraDAO();

    public static EditoraDAO getEditoraDAO() {
        return vDAO;
    }
    private static LivroDAO bDAO = new LivroDAO();

    public static LivroDAO getLivroDAO() {
        return bDAO;
    }
}
