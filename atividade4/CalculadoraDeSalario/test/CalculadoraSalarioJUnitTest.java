/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lua
 */
public class CalculadoraSalarioJUnitTest {
    
    public CalculadoraSalarioJUnitTest() {
    }
    
    @Test
    public void testeVerificaDesenvolvedor() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCargo("desenvolvedor");
        String res = CalculadoraDeSalario.verificaCargo(funcionario);
         assertEquals("desenvolvedor", res);
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
