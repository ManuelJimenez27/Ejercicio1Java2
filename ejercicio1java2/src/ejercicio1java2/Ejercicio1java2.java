/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1java2;
import java.util.Scanner;
/**
 *
 * @author Usuario DAM 1
 */
public class Ejercicio1java2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        double nota1;
        double nota2, notadeseada;
        double mediamedia;
        
        System.out.println("Intoduce la nota del primer examen");
        nota1 = sc.nextDouble();
        mediamedia=nota1 * 0.4;
        System.out.println("¿Que nota quiere sacar en el trimestre?");
        notadeseada = sc.nextDouble();
        nota2=(notadeseada-mediamedia)/0.6;
        System.out.println("Para tener un "+notadeseada+" en el trimestre necesitas sacar un "+nota2+" en el segundo examen");
    }
    
}
