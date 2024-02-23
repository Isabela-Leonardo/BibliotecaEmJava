package mycompany.sistemabiblioteca;

import java.util.Date;

public class Emprestimo {
    private int idEmprestimo;
    private Date dataSaida;
    private Date dataDevolucao;
    private Date dataDevolucaoEsperada;
    private String cpf;
    private int idLivro;

    public Emprestimo(int idEmprestimo, Date dataSaida, Date dataDevolucaoEsperada, String cpf, int idLivro) {
        this.idEmprestimo = idEmprestimo;
        this.dataSaida = dataSaida;
        this.dataDevolucaoEsperada = dataDevolucaoEsperada;
        this.cpf = cpf;
        this.idLivro = idLivro;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setDataDevolucaoEsperada(Date dataDevolucaoEsperada) {
        this.dataDevolucaoEsperada = dataDevolucaoEsperada;
    }
    
    

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public Date getDataDevolucaoEsperada() {
        return dataDevolucaoEsperada;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdLivro() {
        return idLivro;
    }
    
    

    
    
    
    
    
}
