package Services;

public class ServicosFactory {

    private static ClienteServicos cServicos = new ClienteServicos();

    public static ClienteServicos getClienteServicos() {
        return cServicos;

    }
}
