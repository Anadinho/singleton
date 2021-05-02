/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author suporte
 */
public class TestaPessoa {
    
   
    public static void main(String[] args) {
        String nome = "natalia";        
        Pessoa pessoa=new Pessoa();        
        pessoa.setNome(nome);        
     
        
        
        String nomee="natalia";
        Pessoa natalia = new Pessoa();
        natalia.setNome(nome);
        natalia.setAltura(1.75);
        System.out.println(natalia.getNome() + natalia.getAltura());
        System.out.println("");
        System.out.println(pessoa.getNome() + pessoa.getAltura());
    }
    
    
    
    
    
}
