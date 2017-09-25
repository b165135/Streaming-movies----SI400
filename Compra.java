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
public class Compra {
    private int nomeCliente;
    private int nomeFilme;
    private int tipoCompra;

    public int getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(int nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(int nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(int tipoCompra) {
        this.tipoCompra = tipoCompra;
    }

    public Compra(int nomeCliente, int nomeFilme, int tipoCompra) {
        this.nomeCliente = nomeCliente;
        this.nomeFilme = nomeFilme;
        this.tipoCompra = tipoCompra;
    }
}
