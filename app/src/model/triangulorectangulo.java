package model;

/**
 * Esta clase define objetos de tipo Triángulo Rectángulo con una
 * base y una altura como atributos.
 * 
 * @version 1.2/2020
 */
public class triangulorectangulo {
    int base ; // Atributo que define la base de un triángulo rectángulo
    int altura ; // Atributo que define la altura de un triángulo rectángulo

    /**
     * Constructor de la clase TriánguloRectángulo
     * 
     * @param base   Parámetro que define la base de un triángulo
     *               rectángulo
     * @param altura Parámetro que define la altura de un triangulo
     *               rectángulo
     */
    public triangulorectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula y devuelve el área de un triángulo rectángulo
     * rectángulo como la suma de la base, la altura y la hipotenusa
     * 
     * @return Área de un triángulo rectángulo
     */
    public double calcularArea(){
        return (base * altura / 2);

    }
    /**
     * Método que calcula y devuelve el perímetro de un triángulo
     * rectángulo como la suma de la base, la altura y la hiportenusa
     * 
     * @return Perímetro de un triángulo rectángulo
     */
    public double calcularPerimetro(){
        return (base + altura + calcularHipotenusa()); /**invoca al método calcular hipotenusa */
    }

    /**
     * Método que calcula y devuelve la hipotenusa de un triángulo 
     * rectángulo utilizando el teorema de pítagoras 
     * @return Hipotenusa de un triángulo rectángulo 
     */
    double calcularHipotenusa(){
        return Math.pow(base * base + altura * altura, 0.5);
    }

    /**
     * Método que determina si un triángulo es :
     * -Equilatero: si sus tres lados son iguales 
     * -Escaleno: si sus tres lados son todos diferentes
     * -escaleno: si dos de sus lados son iguales y el otro diferente a los demas 
     */
        public void determinarTipoTriangulo(){
            if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
                System.out.println("Es un triángulo equilátero "); /*todos sus lados son iguales  */
            } else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
                System.out.println("Es un triangulo escaleno "); /*todos sus lados son diferentes */
            }else{
                System.out.println("Es un triangulo escaleno "); /* de otra manera es isósceles  */
            }
        }
}