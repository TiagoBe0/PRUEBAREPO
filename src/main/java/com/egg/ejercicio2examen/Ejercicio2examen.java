/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.egg.ejercicio2examen;

import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejercicio2examen {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO");
        
        System.out.println("ingrese su nombre");
        String nombre = leer.next();
        System.out.println("ingrese su edad");
        int edad = leer.nextInt();
        System.out.println("ingrese su peso");
        float peso =leer.nextFloat();
        System.out.println("ingrese su genero");
        String genero = leer.next();
        System.out.println("ingrese su altura");
        float altura = leer.nextFloat();
        
        //Dos formas
        Persona p = new Persona();
        p.setAltura(altura);
        p.setGenero(genero);
        p.setNombre(nombre);
        p.setEdad(edad);
        p.setPeso(peso);
        //constructor parametrizado
        
        Persona p1 = new Persona(nombre, edad, genero, altura, peso);
        
        
        
        
        //calcular imc
        
        int imc = p.calcularIMC();
        switch (imc) {
            case -1:
                System.out.println("USTED SE ENCUENTRA POR DEBAJO DE SU INDICE DE MASA CORPORAL");
                break;
                
            case 0:
                System.out.println("USTED TIENE TREMENDO BODY");
                break;
                
                
            default:
                System.out.println("USTED TIENE SOBREPESO");
        }
        
        
    }
}
