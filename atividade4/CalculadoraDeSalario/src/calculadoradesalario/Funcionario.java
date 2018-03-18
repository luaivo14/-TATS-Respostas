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
public class Funcionario {
    String nome;
    String email;
    double salárioBase;
    double salárioLiquido;
    
     public double getSalárioLiquido() {
        return salárioLiquido;
    }

    public void setSalárioLiquido(double salárioLiquido) {
        this.salárioLiquido = salárioLiquido;
    }
    String cargo;
    
    public Funcionario() {
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalárioBase() {
        return salárioBase;
    }

    public void setSalárioBase(double salárioBase) {
        this.salárioBase = salárioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    
    
    
    
}