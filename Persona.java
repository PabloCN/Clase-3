/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprogramaoo;

/**
 *
 * @author Angel Crepuscular
 */
public class Persona {
    
 private String nombre;
 private int edad;
 private double peso;
 private double estatura;
 private char sexo;
 private String procedencia;

 
    //Metodo Constructor
 public Persona(){
 
 nombre= "";
 edad= 0;
 peso=0;
 estatura= 0;
 sexo= 'i';
 procedencia="desconocido";
 }

  //definir comportamientos(metodos)
 
 
 void saludar(){
 System.out.println("Hola, ¿Como estas?, soy " + getNombre());
 }
 
 
 //metodo para obtener el valor de la edad
 
 public int getEdad(){
     return this.edad;    
 }
 
 public void setEdad(int edad){
     this.edad= edad;
 }

/*
 El elemento de arriba lo hice yo sin embargo los de abajo se hcicieron autmomaticos 
 con la ayuda de click derecho Refractor-->EncapsulateClass-->y poner palomita en los atributos
que se quiere hacer
 */
 
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the procedencia
     */
    public String getProcedencia() {
        return procedencia;
    }

    /**
     * @param procedencia the procedencia to set
     */
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
 
}
