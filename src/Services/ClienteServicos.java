package Services;

import dao.ClienteDAO;
import dao.DAOFactory;
import java.util.ArrayList;
import model.Cliente;

public class ClienteServicos {

    public void cadCliente(Cliente cVO) {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.cadastrarClienteDAO(cVO);
    }

    public void atualizarCliente(Cliente cVO) {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.atualizarClienteByDoc(cVO);
    }

    public void deletarCliente(String cpf) {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.deletarClienteDAO(cpf);
    }

    public Cliente buscarClienteByCPF(String cpf) {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.getClienteByDoc(cpf);
    }

    public ArrayList<Cliente> getClientes() {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.getClientesDAO();

    }

  
}