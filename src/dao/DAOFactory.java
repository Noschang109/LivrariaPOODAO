package dao;

public class DAOFactory {

private static  ClienteDAO cDAO = new ClienteDAO();

    public static ClienteDAO getClienteDAO() {

        return cDAO;
    }
}//FimFactory
