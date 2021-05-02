/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.text.DecimalFormat;

/**
 *
 * @author suporte
 */
public class Pessoa {
    
    private String nome;
    private double altura;
    private double peso;
    private int idade;
    private String sexo;
    
    
    private static Pessoa instance;
    
   Pessoa (){ };
    
    public static Pessoa getInstance(){
        if(instance==null)
            instance = new Pessoa();
        return instance;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public double getRetornaImc(){
        double resultado;
        resultado=(peso) / (altura*altura);
        return resultado;
        
    }
    
    public double getRetornaPesoIdeal(){
         double resultado;       
         resultado = 0;
         
        if(sexo.equalsIgnoreCase("M")){      
         resultado=((72.7*altura)-58);          
         
        }else{
            resultado=((62.1*altura)-44.7);
        }
        return resultado;
        
    }
    
    
       public String getRetornaSobrePeso(){
         double resultado;  
         String resultadoSobrePeso;
         resultado = 0;
           String  resultadoString;
          DecimalFormat df = new DecimalFormat("#.##");
         
        if(sexo.equalsIgnoreCase("M")){      
         resultado=(peso-((72.7*altura)-58));
         resultadoString=df.format(resultado);
         
            if(resultado >0){
                resultadoSobrePeso = nome+ "esta acima do peso ideal " +resultadoString +"Kg";
            }
            else if(resultado <0){
                resultadoSobrePeso = nome+ "esta abaixo do peso ideal " +resultadoString +"Kg";
            }
            else{
                 resultadoSobrePeso = nome+ "esta no peso ideal " +resultadoString +"Kg";
            }
         
         
        }else{
            resultado=(peso-((62.1*altura)-44.7));
             resultadoString=df.format(resultado);
            if(resultado >0){
                resultadoSobrePeso = nome+ "esta acima do peso ideal " + resultadoString +"Kg" ;
            }
            else if(resultado <0){
                resultadoSobrePeso = nome+ "esta abaixo do peso ideal "  + resultadoString +"Kg";
            }
            else{
                 resultadoSobrePeso = nome+ "esta no peso ideal " + resultadoString +"Kg";
            }
        }
        
     
        return ""+ resultadoSobrePeso;
        
        
    }
    
    




    
}
