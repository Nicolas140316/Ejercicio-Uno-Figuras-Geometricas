package app;

 import model.circulo;
 import model.cuadrado;
 import model.rectangulo;
 import model.triangulorectangulo;
    
    public class App {
        public static void main(String[] args) throws Exception {
            /**
             * 
             */
    
            circulo objCirculo = new circulo(2);
    
            System.out.println("El área del círculo es  = " + objCirculo.calcularArea());
            System.out.println("El perímetro del círculo es =" + objCirculo.calcularPerimetro());
            System.out.println();
    
            rectangulo objCRectangulo = new rectangulo(2, 2);
    
            System.out.println("El área del rectángulo es = " + objCRectangulo.calcularArea());
            System.out.println("El perímetro del rectángulo es = " + objCRectangulo.calcularPerimetro());
            System.out.println();
    
            cuadrado objCuadrado = new cuadrado(4);
            System.out.println("El área del cuadrado es = " + objCuadrado.calcularArea());
            System.out.println("El perímetro del cuadrado es =" + objCuadrado.calcularPerimetro());
            System.out.println();
    
        }
    } 
