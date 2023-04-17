/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import model.VendaLivro;
import dao.VendaLivrosDAO;
/**
 *
 * @author jbferraz
 */
public class ServicosFactory {
    private static ClienteServicos cServicos = new ClienteServicos();
    private static EditoraServicos eServicos = new EditoraServicos();
    private static LivroServicos livroS = new LivroServicos();
    private static VendaLivrosServicos vLServicos = new VendaLivrosServicos();
    public static ClienteServicos getClienteServicos(){
        return cServicos;
    }
    public static EditoraServicos getEditoraServicos(){
        return eServicos;
    }
    
    public static LivroServicos getLivroServicos(){
        return livroS;
    }

   public static VendaLivrosServicos getLivrosServicos(){
       return vLServicos;
               
   }
   
}
