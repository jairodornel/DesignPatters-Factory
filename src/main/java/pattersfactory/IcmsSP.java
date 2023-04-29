/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattersfactory;

import java.math.BigDecimal;
import modelo.Orcamento;

/**
 *
 * @author Admin
 */
public class IcmsSP implements CalculoPorRegiao{
    
    /**
     *
     * @param orcamento
     * @return
     */
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.valorOrcamento.multiply(new BigDecimal("0.12"));
    }
}
