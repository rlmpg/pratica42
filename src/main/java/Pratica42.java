
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anna
 */
public class Pratica42 {
    
    public static void main(String[] args) {
        Elipse nomedaelipse = new Elipse(10, 5);
        Circulo nomedocirculo = new Circulo (5);
        
        System.out.println(nomedaelipse.getEixoMenor());
        System.out.println(nomedaelipse.getEixoMaior());
        System.out.println(nomedaelipse.getNome());
        System.out.println(nomedaelipse.getPerimetro());
        System.out.println(nomedaelipse.getArea());
        
        System.out.println(nomedocirculo.getPerimetro());
        System.out.println(nomedocirculo.getArea());
        
    }
    
    
    
}
