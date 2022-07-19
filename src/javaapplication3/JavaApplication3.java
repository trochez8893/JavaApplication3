/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Jairo Trochez
 */
public class JavaApplication3 {


    public static void main(String[] args) {
   int periodo1;
   int periodo2;
   int total;
   Scanner teclado=new Scanner(System.in);
   
        System.out.println("Ingrese la nota del primer periodo");
        periodo1=teclado.nextInt();
        
        
        System.out.println("Ingrese la nota del segundo periodo");
        periodo2=teclado.nextInt();
        
         System.out.println("La nota final del periodo es :");
         total=periodo1+periodo2;
         System.out.println(total);
    
        {
    if (total>=60){
    System.out.println("El alumno esta aprobado");
}
    else if (total<=59){
    System.out.println("El alumno esta reprobado");
}
}
    }

}



    

