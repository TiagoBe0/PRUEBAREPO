


package com.egg.ejercicio2examen;


public class Persona {
    
    
    private String nombre;
    private int edad;
    private String genero;
    private float altura;
    private float peso;

    public Persona(String nombre, int edad, String genero, float altura, float peso) {
        
        if(genero.equals("h")|| genero.equals("m")||genero.equals("o")){
        
         this.genero = genero;
        }
        else{
        
            System.out.println("genero incorrecto");
             this.genero = "o";
        
        }
        this.nombre = nombre;
        this.edad = edad;
       
        this.altura = altura;
        this.peso = peso;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    public int calcularIMC(){
    
    float index=0.f;
    
    index = this.peso/(this.altura*this.altura);
    if(index<20){
    
    return -1;
    
    }
    else{
        
        if(index>=20 && index<=25){
            
            return 0;
        
        }else{
            
            
        return 1;
        
        }
    
    
    }
    
    
    }
    
    
    public boolean esMayorDeEdad(){
    
    if(this.edad>=18){
    
    return true;
    }
    else{
    return false;
    }
    
    }

}
