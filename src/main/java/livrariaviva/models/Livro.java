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
    
    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private float valor;
    private int qtd;

    public Livro(String titulo, String autor, String editora, float valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.valor = valor;
    }

    public int getId() {
        return id;
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
 
    
////    public void salvar(JdbcTemplate jdbc) {
////        if (id > 0) {
////            jdbc.update(
////            "UPDATE produtos SET nome = ?, "
////            + "preco = ?, qtd = ? "
////            + "WHERE id = ?;", (ps) -> {
////                ps.setString(1, nome);
////                ps.setFloat(2, preco);
////                ps.setInt(3, qtd);
////                ps.setInt(4, id);
////            });
////        } else {
////            jdbc.update(
////            "INSERT INTO produtos (nome, preco, qtd) " +
////            "VALUES (?, ?, ?);", (ps) -> {
////                ps.setString(1, nome);
////                ps.setFloat(2, preco);
////                ps.setInt(3, qtd);
////            });
////        }
////    }
//    
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
                p.id = rs.getInt("id");
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
////    public static Produto buscar(int id,
////            JdbcTemplate jdbc) {
////        AtomicReference<Produto> produto
////                = new AtomicReference<>();
////        jdbc.query("SELECT * FROM produtos "
////        + "WHERE id = ?;", (ps) -> {
////            ps.setInt(1, id);
////        }, (rs) -> {
////            Produto p = new Produto(
////                    rs.getString("nome"), 
////                    rs.getInt("qtd"),
////                    rs.getFloat("preco"));
////            p.id = rs.getInt("id");
////            produto.set(p);
//        });
//        return produto.get();
//    }
//    
}
