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
public class Cliente {
    private String nomeCliente;
    private int rgCliente;
    private int cpfCliente;
    private String dataNascimentoCliente;
    private String enderecoCliente;
    private int telefoneCliente;
    private float pontosAdquiridos;

    public Cliente(String nomeCliente, int rgCliente, int cpfCliente, String dataNascimentoCliente, String enderecoCliente, int telefoneCliente, float pontosAdquiridos) {
        this.nomeCliente = nomeCliente;
        this.rgCliente = rgCliente;
        this.cpfCliente = cpfCliente;
        this.dataNascimentoCliente = dataNascimentoCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
        this.pontosAdquiridos = pontosAdquiridos;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(int rgCliente) {
        this.rgCliente = rgCliente;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getDataNascimentoCliente() {
        return dataNascimentoCliente;
    }

    public void setDataNascimentoCliente(String dataNascimentoCliente) {
        this.dataNascimentoCliente = dataNascimentoCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public int getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(int telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public float getPontosAdquiridos() {
        return pontosAdquiridos;
    }

    public void setPontosAdquiridos(float pontosAdquiridos) {
        this.pontosAdquiridos = pontosAdquiridos;
    }
}
