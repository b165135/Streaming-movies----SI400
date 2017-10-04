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
    private int pontosAdquiridos;
    private Aluguel alugado; 
    
    

    public Aluguel getAlugado() {
        return alugado;
    }

    public void setAlugado(Aluguel alugado) {
        this.alugado = alugado;
    }

    public Cliente(String nomeCliente, int rgCliente, int cpfCliente, String dataNascimentoCliente, String enderecoCliente, int telefoneCliente, int pontosAdquiridos, Aluguel alugado) {
        this.nomeCliente = nomeCliente;
        this.rgCliente = rgCliente;
        this.cpfCliente = cpfCliente;
        this.dataNascimentoCliente = dataNascimentoCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
        this.pontosAdquiridos = pontosAdquiridos;
        this.alugado = alugado; 
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

    public int getPontosAdquiridos() {
        return pontosAdquiridos;
    }

    public void setPontosAdquiridos(int pontosAdquiridos) {
        this.pontosAdquiridos = pontosAdquiridos;
    }
    
    public void mudaEnderecoCliente (String novoEnderecoCliente) {
        this.enderecoCliente = novoEnderecoCliente; 
    }
    
    public void mudaTelefoneCliente (int novoTelefoneCliente) {
        this.telefoneCliente = novoTelefoneCliente; 
    }
    
    
    public int calculaPontosAdquiridos () {
        /*Caso o aluguel que o cliente realize seja por apenas um dia, ele ganha 1 ponto;
          Caso seja de 2 a 5 dias, ele ganha 2 pontos;
          Caso seja de 6 ou 7 dias, ele ganha 3 pontos;
        */
        
        pontosAdquiridos = 0;
        
        if (alugado.getDiasAlugado() == 1) {
            pontosAdquiridos = pontosAdquiridos + 1;
        }
        
        if ((alugado.getDiasAlugado() >= 2) && (alugado.getDiasAlugado() <=5)) {
            pontosAdquiridos = pontosAdquiridos + 2;
        }
        
        if (alugado.getDiasAlugado() >= 6) {
            pontosAdquiridos = pontosAdquiridos + 3;
        }
        
        return pontosAdquiridos;
            
    }
}
