/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoradesalario;

/**
 *
 * @author Lua
 */
public class CalculadoraDeSalario {
    public static String verificaCargo(Funcionario funcionario){
        if( funcionario.getCargo().equals("desenvolvedor")){
            return"desenvolvedor";
        }else if( funcionario.getCargo().equals("DBA")){
            return"DBA";
        }else if( funcionario.getCargo().equals("testador")){
            return"testador";
        }
        return "";
    }
}