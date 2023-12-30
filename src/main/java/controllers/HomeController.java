/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.List;
import livrariaviva.models.Cliente;
import livrariaviva.models.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Meury
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        List<Livro> livros = Livro.exibir(jdbc);
        model.addAttribute("livros", livros);
        System.out.println(livros.isEmpty());
        return "index";
    }

    @Autowired
    JdbcTemplate jdbc;

   @PostMapping("/preencherForms")
    public String preencherForms (String nomecliente, String nomedestinatario, String email, String telefone, String cpf, 
            String enderecorua, String endereconumero, String enderecobairro, String enderecocep) {
        Cliente c = new Cliente (nomecliente, nomedestinatario, email, telefone, cpf, 
                enderecorua, endereconumero, enderecobairro, enderecocep);
        c.cadastrar(jdbc);
        return "redirect:/";
    }
}
