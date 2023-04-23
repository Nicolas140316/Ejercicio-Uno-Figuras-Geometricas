package model;

/**
 * Esta clase define objetos de tipo rectángulo con una base y una
 * altura como atributos.
 * 
 * @version 1.2/2020
 */
public class rectangulo {
    private int base; // Atributo que define la base de un rectángulo
    private int altura; // Atríbuto que define la altura de un rectángulo

    /**
     * constructor de la base Rectangulo
     * 
     * @param base   Parámetro que define la base de un rectángulo
     * @param altura Parámetro que define la altura de un rectángulo 
     */
    public rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula y devulve el área de un rectángulo como la
     * multiplicacion de la base por la altura
     * 
     * @return Area de un rectángulo
     */
    public double calcularArea(){
        return base * altura;
    }

    /**
     * Método que calcula y devuelve el perimetro de un rectángulo
     * como (2 * base) + (2 * altura)
     * 
     * @return Perímetro de un rectángulo
     */
    public double calcularPerimetro(){
        return (2 * base) + (2 * altura);
    }
}