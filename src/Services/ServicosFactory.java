package Services;

public class ServicosFactory {

    private static ClienteServicos cServicos = new ClienteServicos();

    public static ClienteServicos getClienteServicos() {
        return cServicos;

    }

     private static EditoraServicos vServicos = new EditoraServicos();
     
     public static EditoraServicos getEditoraServicos(){
         return vServicos;
     }
     
     private static LivroServicos mServicos = new LivroServicos();
     
     public static LivroServicos getLivroServicos(){
         return mServicos;
     }
     
}
