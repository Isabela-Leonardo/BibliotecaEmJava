package mycompany.sistemabiblioteca;

import java.util.ArrayList;
import java.util.List;


public class ControladorLivro {
    private List<Livro> listaLivros = new ArrayList<>();
    
    public boolean existeLivro(int idLivro){
        for (Livro l: this.listaLivros){ // serve p/ rodar a lista
            if (l.getIdLivro()== idLivro){
                return true;
            }
        }
        return false;
    }
    
    public Livro pesquisarLivro (int idLivro){
        for (Livro l: this.listaLivros){
            if (l.getIdLivro()== idLivro){
                return l;
            }
        }
        return null;
    }
    
    public int retornaIndiceLivro(int idLivro){
         for (Livro l: this.listaLivros){
             if (l.getIdLivro()== idLivro){
                 return this.listaLivros.indexOf(l);
             }
         }
         return -1;
    }
    
    public boolean salvarLivro(Livro l){
        if (l==null){ //ou seja, só salva se os dad0s forem preenchidos
            return false;
        }
        
        if (existeLivro(l.getIdLivro())){
            // se o cliente existe, faça alteção
            this.listaLivros.set(retornaIndiceLivro(l.getIdLivro()), l);
            return true;
        }
        else{
            this.listaLivros.add(l);
            return true;
        }
    }
    
    public boolean excluirLivro(Livro l){
        if (l==null){ 
            return false;
        } 
        
        if (existeLivro(l.getIdLivro())){ 
            this.listaLivros.remove(retornaIndiceLivro(l.getIdLivro()));
            return true;
        }
        else{
            return false;
        }
    }
    
    public List<Livro> retornaTodos()  
    {
        return this.listaLivros;
    }
    
}
