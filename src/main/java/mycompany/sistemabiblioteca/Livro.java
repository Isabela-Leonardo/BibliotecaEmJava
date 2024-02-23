package mycompany.sistemabiblioteca;

import java.util.Date;

public class Livro {
    private int idLivro;
    private String nome;
    private String autor;
    private String editora;
    private Date dataPublicacao;
    private String genero;

    public Livro(int idLivro, String nome, String autor, String editora, Date dataPublicacao, String genero) {
        this.idLivro = idLivro;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
    public int getIdLivro() {
        return idLivro;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public String getGenero() {
        return genero;
    }
    
    
}
