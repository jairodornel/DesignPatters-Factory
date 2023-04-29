/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class Orcamento {
    public BigDecimal valorOrcamento;
    public String icmsRegiao;

    public Orcamento(BigDecimal valorOrcamento, String icmsRegiao) {
        this.valorOrcamento = valorOrcamento;
        this.icmsRegiao = icmsRegiao;
    }
    
    
}
