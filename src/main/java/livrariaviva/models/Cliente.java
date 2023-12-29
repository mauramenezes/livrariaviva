/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livrariaviva.models;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

/**
 *
 * @author 20211114010038
 */
public class Cliente {
    
    private int idcliente;
    private String nome, email, telefone, cpf, enderecorua, endereconumero, enderecobairro, enderecocep;

    public Cliente() {
    }
    

    public Cliente(String nome, String email, String telefone, String cpf, String enderecorua, String endereconumero, String enderecobairro, String enderecocep) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.enderecorua = enderecorua;
        this.endereconumero = endereconumero;
        this.enderecobairro = enderecobairro;
        this.enderecocep = enderecocep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnderecorua() {
        return enderecorua;
    }

    public void setEnderecorua(String enderecorua) {
        this.enderecorua = enderecorua;
    }

    public String getEndereconumero() {
        return endereconumero;
    }

    public void setEndereconumero(String endereconumero) {
        this.endereconumero = endereconumero;
    }

    public String getEnderecobairro() {
        return enderecobairro;
    }

    public void setEnderecobairro(String enderecobairro) {
        this.enderecobairro = enderecobairro;
    }

    public String getEnderecocep() {
        return enderecocep;
    }

    public void setEnderecocep(String enderecocep) {
        this.enderecocep = enderecocep;
    }
    
    
    
    
}
