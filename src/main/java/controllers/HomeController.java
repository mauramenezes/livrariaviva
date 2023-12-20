/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import livraria.models.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author 20211114010038
 */
@Controller
public class HomeController {
    
    
    @GetMapping("/")
    public String index(){
        return "index";
    }
    
    @PostMapping("/adicionar")
    public String adicionar(String titulo, String categoria, float valor, String autor, String editora, int ano) {
        Livro l = new Livro(titulo, );
        l.salvar(jdbc);
        return "redirect:/";
        
    }
}