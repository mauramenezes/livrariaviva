/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livrariaviva.models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.springframework.jdbc.core.JdbcTemplate;

public class Livro {
    
    private int idlivro;
    private String titulo;
    private String autor;
    private String editora;
    private float valor;
    private int qtd;

    public Livro() {
    }
    

    public Livro(String titulo, String autor, String editora, float valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.valor = valor;
    }

    public int getId() {
        return idlivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public float getValor() {
        return valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
 
    public static List<Livro> exibir(JdbcTemplate
            jdbc) {
        List<Livro> livros =
                new ArrayList<>();
        jdbc.query("SELECT * FROM livros;",
        (rs) -> {
            do {
                Livro p = new Livro(
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("editora"),
                        rs.getFloat("valor")
                        );
                p.idlivro = rs.getInt("idlivro");
                livros.add(p);
            } while(rs.next());
        });
        return livros;
    }
////    
////    public static void remover(int id,
////            JdbcTemplate jdbc) {
////        jdbc.update("DELETE FROM produtos "
////        + "WHERE id = ?", (ps) -> {
////            ps.setInt(1, id);
////        });
////    }
////    
}
