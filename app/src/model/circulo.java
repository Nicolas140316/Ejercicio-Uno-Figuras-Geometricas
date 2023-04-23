package model; //paquete model

/** 
 * Esta clase define objetos de tipo circulo con su radio como atributo.
 * 
 * @version 1.0/2023
 * Define un atributo llamado radio de tipo entero
 * variable global en la clase...
*/
public class circulo {
    private int radio;

    /**
     * Constructor de la clase Circulo
     * @param radio Parámetro que define el radio de un circulo
     */
    public circulo(int radio){
        this.radio = radio;
    }

    /**
     * Constructor de la clase Circulo sin parametro o esta vacio
     */
    public circulo(){

    }

    /**
     * Método que calcula y devuelve el área de un circulo como pi multiplicado por 
     * el radio al cuadrado
     * @return Área de un circulo
     */
    public double calcularArea(){
    return Math.PI*Math.pow(radio,2);
    }

    /**
     * Método que calcula y devuelve el perimetro de un circulo como la 
     * multiplicacion de pi por el radio por 2
     * @return Perímetro de un circulo 
     */
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }

}