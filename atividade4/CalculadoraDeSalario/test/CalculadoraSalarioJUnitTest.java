/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadoradesalario.CalculadoraDeSalario;
import calculadoradesalario.Funcionario;
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
    public void testeVerificaDesenvolvedorSalarioBaseMenor3mil() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCargo("desenvolvedor");
        funcionario.setSalárioBase(1000);
        double res = CalculadoraDeSalario.verificaCargo(funcionario);
        assertEquals(900 ,res);
    }
    @Test
    public void testeVerificaDBA() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCargo("DBA");
        assertEquals("DBA" ,CalculadoraDeSalario.verificaCargo(funcionario));
    }
    @Test
    public void testeVerificaTestador() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCargo("testador");
        assertEquals("testador" ,CalculadoraDeSalario.verificaCargo(funcionario));
    }
    @Test
    public void testeVerificaGerente() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCargo("gerente");
        assertEquals("gerente" ,CalculadoraDeSalario.verificaCargo(funcionario));
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
