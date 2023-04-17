
package services;
import dao.DAOFactory;
import dao.VendaLivrosDAO;
import model.VendaLivro;


public class VendaLivrosServicos {
public void VendaLivros(VendaLivro vLivros) {
        VendaLivrosDAO vendaLivrosDAO = DAOFactory.getVendaLivrosDAO();
        vendaLivrosDAO.cadastrarPedidoDAO(vLivros);
    }
}
