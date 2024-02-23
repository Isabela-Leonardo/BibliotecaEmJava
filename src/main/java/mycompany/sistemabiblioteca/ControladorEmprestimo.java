package mycompany.sistemabiblioteca;

import java.util.ArrayList;
import java.util.List;

public class ControladorEmprestimo {
    private List<Emprestimo> listaEmprestimos = new ArrayList<>();
    
    public boolean existeEmprestimo(int idEmprestimo){
        for (Emprestimo e: this.listaEmprestimos){ // serve p/ rodar a lista
            if (e.getIdEmprestimo()== idEmprestimo){
                return true;
            }
        }
        return false;
    }
    
    public Emprestimo pesquisarEmprestimo (int idEmprestimo){
        for (Emprestimo e : this.listaEmprestimos){
            if (e.getIdEmprestimo()== idEmprestimo){
                return e;
            }
        }
        return null;
    }
    
     public int retornaIndiceEmprestimo(int idEmprestimo){
         for (Emprestimo e: this.listaEmprestimos){
             if (e.getIdEmprestimo()== idEmprestimo){
                 return this.listaEmprestimos.indexOf(e);
             }
         }
         return -1;
    }
    
    public boolean salvarEmprestimo(Emprestimo e){
        if (e==null){ //ou seja, só salva se os dad0s forem preenchidos
            return false;
        }
        
        if (existeEmprestimo(e.getIdEmprestimo())){
            // se o emprestimo existe, faça alteção
            this.listaEmprestimos.set(retornaIndiceEmprestimo(e.getIdEmprestimo()), e);
            return true;
        }
        else{
            this.listaEmprestimos.add(e);
            return true;
        }
        
    }
    
    public boolean excluirEmprestimo(Emprestimo e){
        if (e==null){ //ou seja, se não selecionar ninguem
            return false;
        } 
        
        if (existeEmprestimo(e.getIdEmprestimo())){ 
            // se o cliente existe, pode excluir
            this.listaEmprestimos.remove(retornaIndiceEmprestimo(e.getIdEmprestimo()));
            return true;
        }
        else{
            return false; // ou seja, não encontrou aquele cliente
        }
    }
    
    public List<Emprestimo> retornaTodos(){
        return this.listaEmprestimos;
    }
    
    public List<Emprestimo> retornaEmprestimoLivro (int idLivro) {
        List<Emprestimo> listaEmprestimoLivro = new ArrayList<>();
        for (Emprestimo e : this.listaEmprestimos) {
            
            if (e.getIdLivro() == idLivro) {
                listaEmprestimoLivro.add(e);
            }
        }
        return listaEmprestimoLivro;
    }
}
