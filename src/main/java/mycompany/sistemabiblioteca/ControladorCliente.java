package mycompany.sistemabiblioteca;

import java.util.ArrayList;
import java.util.List;

public class ControladorCliente {
    private List<Cliente> listaClientes = new ArrayList<>();
    
    public boolean existeCliente(int cpf){
        for (Cliente c: this.listaClientes){
            if (c.getCpf()== cpf){
                return true;
            }
        }
        return false;
    }
    
    public Cliente pesquisarCliente (int cpf){
        for (Cliente c : this.listaClientes){
            if (c.getCpf()== cpf){
                return c;
            }
        }
        return null;
    }
    
    public int retornaIndiceCliente(int cpf){
         for (Cliente c : this.listaClientes){
             if (c.getCpf()== cpf){
                 return this.listaClientes.indexOf(c);
             }
         }
         return -1;
    }
    
    public boolean salvarCliente(Cliente c){
        if (c==null){ //ou seja, só salva se os dad0s forem preenchidos
            return false;
        }
        
        if (existeCliente(c.getCpf())){
            // se o cliente existe, faça alteção
             
            this.listaClientes.set(retornaIndiceCliente(c.getCpf()), c);           
            return true;
        }
        else{
            this.listaClientes.add(c);
            return true;
        }
    }
    
    public boolean excluirCliente(Cliente c){
        if (c==null){ //ou seja, se não selecionar ninguem
            return false;
        } 
        
        if (existeCliente(c.getCpf())){ 
            // se o cliente existe, pode excluir
            this.listaClientes.remove(retornaIndiceCliente(c.getCpf()));
            return true;
        }
        else{
            return false; // ou seja, não encontrou aquele cliente
        }
    }
    
    public List<Cliente> retornaTodos()       
    {
        return this.listaClientes;
    }
}
