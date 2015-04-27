import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class Pratica31 {
    private static String meuNome = "Fernando Ikeda Ferreira Guedes";
    private static GregorianCalendar dataNascimento = new GregorianCalendar(1996, 10, 5);
    private static Date inicio, fim;
    
    public static void main(String[] args) {
        inicio = new Date();
        
        String nomeCaps;
        nomeCaps = meuNome.toUpperCase();
        
        System.out.println(nomeCaps);
        
        String nomePadronizado;
        
        nomePadronizado = meuNome.substring(24, 25).toUpperCase() +
                meuNome.substring(25, 30).toLowerCase() + ", "
                + meuNome.substring(0, 1).toUpperCase() + "."
                + meuNome.substring(9, 10).toUpperCase() + "."
                + meuNome.substring(15,16).toUpperCase() + ".";
        
        System.out.println(nomePadronizado +"\n");
        
        long dias;
        
        dias = (inicio.getTime() - dataNascimento.getTimeInMillis())
        /(86400000);
        
        System.out.println(dias);
        
        fim = new Date();
        
        long ms = fim.getTime() - inicio.getTime();
        
        System.out.println(ms);
        
    }
}