/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoa;

/**
 *
 * @author Admin
 */
public class Pessoa {
    //Atributos
    
    int idPessoa;
    String nome;
    int idade;
    String profissao;
    
    //métodos
    
    public void falar(){
        System.out.println("A" +nome + "está falando");
    }
        
    public void trabalhar(){
       System.out.println("A" +nome + "está trabalhando");
    }
    
    public void estudar(){
       System.out.println("A" +nome + "está estudando");
    }  
       
}
