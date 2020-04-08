/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author SkylakeFrost
 */
public abstract class Persona {

    protected int dni;
    protected String nombre;
    protected String apellido;
    protected long cuit;

    public Persona(int dni, String nombre, String apellido, long cuit) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuit = cuit;
    }

    public Persona() {
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public abstract long getCuit();

    public abstract void setCuit(long cuit);

}
