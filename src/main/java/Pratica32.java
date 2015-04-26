import static java.lang.Math.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */

public class Pratica32 {
    public static void main(String[] args) { //chamada para a função densidade, e passagem dos valores para x 
        System.out.println(densidade(-1, 67, 3)); //Exiba o valor calculado. Verifique se o valor calculado está correto.
    }
    
    public static double densidade(double x, double media, 
            double desvio) { //calculo
        double d = (exp(-0.5*(pow((x - media)/desvio, 2))))/(sqrt(2*PI)*desvio);
        return d;
    }
}
