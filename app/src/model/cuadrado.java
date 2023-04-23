package model;

/**
 * Esta clase define objetos de tipo cuadrado con un lado como atributo.
 * 
 * @version 1.2/2022
 */
public class cuadrado {
    int lado; // Atributo que define el lado de un cuadrado
    
    /**
     * Constructor de la clase cuadrado
     * 
     * @param lado Parametro que define la longitud de la base de un 
     *             cuadrado
     */
    public cuadrado(int lado){
        this.lado = lado;
    }

    /**
     * Método que calcula y devuelve el área de un cuadrado como el
     *lado elevado al cuadrado
     *
     * @return Área de un cuadrado
     */
    public double calcularArea(){
        return lado * lado;
    }

    /**
     * Método que calcula y devuelve el perimetro de un cuadrado como
     * cuatro veces su lado
     * 
     * @return Perímetro de un cuadrado 
     */
    public double calcularPerimetro(){
        return (4*lado);
    }
}