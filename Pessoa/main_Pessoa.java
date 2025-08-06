/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pessoa;

/**
 *
 * @author Admin
 */
public class main_Pessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa pessoa = new Pessoa();
        pessoa.idPessoa = 1;
        pessoa.nome = "Melissa";
        pessoa.idade = 17;
        pessoa.profissao = "Analista de Desenvolvimento de Sistemas";
        
        System.out.println("--------Classe Pessoa------- ");
        System.out.println("Numero de identificador:" + pessoa.idPessoa);
        System.out.println("Numero de identificador:" + pessoa.nome);
        System.out.println("Numero de identificador:" + pessoa.idade);
        System.out.println("Numero de identificador:" + pessoa.profissao);
        pessoa.estudar();
    }
    
}
