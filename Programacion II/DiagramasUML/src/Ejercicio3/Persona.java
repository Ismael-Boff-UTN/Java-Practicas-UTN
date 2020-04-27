/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SkylakeFrost
 */
public abstract class Persona {

    private String nombre;
    private String apellido;
    private Foto foto;
    private List<MedioDeComunicacion> comunicacion = new ArrayList<>();
    private List<Perfil> perfiles = new ArrayList<>();

    public Persona(String nombre, String apellido, Foto foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;

    }

    public Persona() {
    }

    public void agregarPerfil(Perfil perfil) {
        perfiles.add(perfil);
    }

    public void agregarPerfil(int tipoPerfil, String descripcion) {
        Perfil perfil = new Perfil(tipoPerfil, descripcion);
        perfiles.add(perfil);
    }

    public boolean quitarPerfil(int indice) {
        perfiles.remove(indice);
        return true;
    }

    public List<MedioDeComunicacion> getComunicacion() {
        return comunicacion;
    }

    public void setComunicacion(List<MedioDeComunicacion> comunicacion) {
        this.comunicacion = comunicacion;
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

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public List<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(List<Perfil> perfiles) {
        this.perfiles = perfiles;
    }

}
