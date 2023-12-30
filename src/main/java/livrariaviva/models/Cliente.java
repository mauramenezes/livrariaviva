/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livrariaviva.models;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author 20211114010038
 */
public class Cliente {
    
    private int idcliente;
    private String nomecliente, nomedestinatario, email, telefone, cpf, enderecorua, endereconumero, enderecobairro, enderecocep;

    public Cliente() {
    }
    

    public Cliente(String nomecliente, String nomedestinatario, String email, String telefone, String cpf, String enderecorua, String endereconumero, String enderecobairro, String enderecocep) {
        this.nomecliente = nomecliente;
        this.nomedestinatario = nomedestinatario;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.enderecorua = enderecorua;
        this.endereconumero = endereconumero;
        this.enderecobairro = enderecobairro;
        this.enderecocep = enderecocep;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getNomedestinatario() {
        return nomedestinatario;
    }

    public void setNomedestinatario(String nomedestinatario) {
        this.nomedestinatario = nomedestinatario;
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
    
     
    public void cadastrar(JdbcTemplate jdbc) {
        jdbc.update(
            "INSERT INTO clientes (nomecliente, email, nomedestinario, enderecorua, endereconumero, enderecobairro, enderecocep, telefone, cpf) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);", (ps) -> {
                ps.setString(1, nomecliente);
                ps.setString(2, email);
                ps.setString(3, nomedestinatario);
                ps.setString(4, enderecorua);
                ps.setString(5,  endereconumero);
                ps.setString(6, enderecobairro);
                ps.setString(7,  enderecocep);
                ps.setString(8, telefone);
                ps.setString(9, cpf);
                       
            });
    }
}
    
    
    
    

