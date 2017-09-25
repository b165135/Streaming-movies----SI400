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
public class Funcionario {
    private int rgFuncionario;
    private String dataNascimentoFuncionario;
    private int cpfFuncionario;
    private String enderecoFuncionario;
    private int telefoneFuncionario;
    private int carteiraDeTrabalho;
    private String login;
    private String senha;

    public int getRgFuncionario() {
        return rgFuncionario;
    }

    public void setRgFuncionario(int rgFuncionario) {
        this.rgFuncionario = rgFuncionario;
    }

    public String getDataNascimentoFuncionario() {
        return dataNascimentoFuncionario;
    }

    public void setDataNascimentoFuncionario(String dataNascimentoFuncionario) {
        this.dataNascimentoFuncionario = dataNascimentoFuncionario;
    }

    public int getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(int cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    public int getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(int telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public int getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public void setCarteiraDeTrabalho(int carteiraDeTrabalho) {
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario(int rgFuncionario, String dataNascimentoFuncionario, int cpfFuncionario, String enderecoFuncionario, int telefoneFuncionario, int carteiraDeTrabalho, String login, String senha) {
        this.rgFuncionario = rgFuncionario;
        this.dataNascimentoFuncionario = dataNascimentoFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        this.enderecoFuncionario = enderecoFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.carteiraDeTrabalho = carteiraDeTrabalho;
        this.login = login;
        this.senha = senha;
    }
}
