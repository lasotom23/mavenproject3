/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author jdaso
 */
public class Mavenproject3 {

    public static void main(String[] args) {
class Persona {
    protected String nombre;
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
}


class Doctor extends Persona {
    private String especialidad;
    
    public Doctor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }
    
    public void tratarPaciente(String paciente) {
        System.out.println("El doctor " + nombre + " está tratando al paciente " + paciente);
    }
    
    public void realizarCirugia(String paciente) {
        System.out.println("El doctor " + nombre + " está realizando una cirugía al paciente " + paciente);
   
   

    }