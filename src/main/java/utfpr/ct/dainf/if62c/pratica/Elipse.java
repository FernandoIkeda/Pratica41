/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Fernando
 */
public class Elipse {
    private double r;
    private double s;
    
    public Elipse(double r, double s) {
        this.r = 2*r;
        this.s = 2*s;
    }
    public double getArea() {
        double area;
        area = Math.PI*(s/2)*(r/2);
        
        return area;
    }
    
    public double getPerimetro() {
        double perimetro;
        perimetro = Math.PI*(3*((s/2)+(r/2)) - 
                  Math.sqrt((3*(s/2)+(r/2)) + ((s/2)+3*(r/2))));
        
        return perimetro;
    }
}
