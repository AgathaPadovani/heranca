/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author padov
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Quadrado quadrado = new Quadrado();
        quadrado.draw();
        
        Triangulo triangulo = new Triangulo();
        triangulo.draw();
        
        Retangulo retangulo = new Retangulo ();
        retangulo.draw();
        
        Circulo circulo = new Circulo();
        circulo.draw();
        
        passaParametroPorHeranca(triangulo);
        // TODO code application logic here
    }
    public static void passaParametroPorHeranca(Figura1 fig){
        fig.drawShape();
    }
    
}
