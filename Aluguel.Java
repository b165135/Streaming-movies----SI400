package locadora;

/**
 *
 * @author Otavio
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
