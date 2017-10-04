package locadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bacs3
 */
public class Filme {
    private NomeFilme nomeFilme;
    private TipoFilme tipoFilme;

    public NomeFilme getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(NomeFilme nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public TipoFilme getTipoFilme() {
        return tipoFilme;
    }

    public void setTipoFilme(TipoFilme tipoFilme) {
        this.tipoFilme = tipoFilme;
    }

    public Filme(NomeFilme nomeFilme, TipoFilme tipoFilme) {
        this.nomeFilme = nomeFilme;
        this.tipoFilme = tipoFilme;
    }
    
    
}
