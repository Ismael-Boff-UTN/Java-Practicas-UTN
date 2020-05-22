/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author SkylakeFrost
 */
public class Foto {
    private String pathToFile;
    private String nombre;
    private float tamanio;

    public Foto(String pathToFile, String nombre, float tamanio) {
        this.pathToFile = pathToFile;
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }
    
    
    
}
