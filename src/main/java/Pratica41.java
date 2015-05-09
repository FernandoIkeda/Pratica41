
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Fernando
 */
public class Pratica41 {
    public static void main(String[] args) {
        Elipse elipse = new Elipse(2.0, 3.0);
        Circulo circulo = new Circulo(4.0);
        
        double areaElipse, perimetroElipse, areaCirculo, perimetroCirculo;
        
        areaElipse = elipse.getArea();
        perimetroElipse = elipse.getPerimetro();
        
        areaCirculo = circulo.getArea();
        perimetroCirculo = circulo.getPerimetro();
        
        System.out.println("Área da elipse: " + areaElipse);
        System.out.println("Perímetro da elipse: " + perimetroElipse);
        
        System.out.println("Área do círculo: " + areaCirculo);
        System.out.println("Perímetro do círculo: " + perimetroCirculo);
    }
}
