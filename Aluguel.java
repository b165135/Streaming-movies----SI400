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
public class Aluguel {
    private int diasAlugado;
    private Filme filme;
    
    public Aluguel(int diasAlugado, Filme filme){
            this.diasAlugado = diasAlugado;
            this.filme = filme;
    }
    
    public int getDiasAlugado() {
        return diasAlugado;
    }
    
    public void setDiasAlugado(int diasAlugado) {
        this.diasAlugado = diasAlugado; 
    }
    
    public Filme getFilme() {
        return filme;
    }
    
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
}
