/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.List;
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
        return "index";
    }

    @Autowired
    JdbcTemplate jdbc;

    //    @GetMapping("/adicionar")
//    public String excluir(int id) {
//        Livro.adicionar(id, jdbc);
//        return "redirect:/";
//    }
//    @PostMapping("/adicionar")
//    public String adicionar(String nome,
//            int qtd, float preco) {
//        Produto p = new Produto(nome, 
//                qtd, preco);
//        p.salvar(jdbc);
//        return "redirect:/";
//    }
//    
}
