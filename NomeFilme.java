/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author bacs3
 */
public class NomeFilme {
    private String nome;
    private String titulo;
    private int classificacao;
    private int anoLancamento;
    private String sinopse;
    private String genero;
    private float duracao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getAnolancamento() {
        return anolancamento;
    }

    public void setAnolancamento(int anolancamento) {
        this.anolancamento = anolancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }
    
    public NomeFilme(String nome, String titulo, int classificacao, int anolancamento, String sinopse, String genero, float duracao) {
        this.nome = nome;
        this.titulo = titulo;
        this.classificacao = classificacao;
        this.anolancamento = anolancamento;
        this.sinopse = sinopse;
        this.genero = genero;
        this.duracao = duracao;
    }
    
}
