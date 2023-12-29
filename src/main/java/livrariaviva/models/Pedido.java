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
public class Pedido {
    
    private int idpedido;
    private DateTimeLiteralExpression.DateTime datapedido;
    private float total;
    private int idcliente, idlivro;

    public Pedido(DateTimeLiteralExpression.DateTime datapedido, float total, int idcliente, int idlivro) {
        this.datapedido = datapedido;
        this.total = total;
        this.idcliente = idcliente;
        this.idlivro = idlivro;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public DateTimeLiteralExpression.DateTime getDatapedido() {
        return datapedido;
    }

    public void setDatapedido(DateTimeLiteralExpression.DateTime datapedido) {
        this.datapedido = datapedido;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdlivro() {
        return idlivro;
    }

    public void setIdlivro(int idlivro) {
        this.idlivro = idlivro;
    }

    
  
  

    
    
}
