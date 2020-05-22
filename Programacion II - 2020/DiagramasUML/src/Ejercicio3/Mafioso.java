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
public class Mafioso extends Persona implements Investigable {

    private List<Lugar> lugaresFrecuentes = new ArrayList<>();

    public Mafioso(String nombre, String apellido, Foto foto) {

        super(nombre, apellido, foto);

    }

    public List<Lugar> getLugaresFrecuentes() {
        return lugaresFrecuentes;
    }

    public void setLugaresFrecuentes(List<Lugar> lugaresFrecuentes) {
        this.lugaresFrecuentes = lugaresFrecuentes;
    }

    public void agregarLugar(Lugar lugar) {
        lugaresFrecuentes.add(lugar);
    }

    public boolean quitarLugar(Lugar lugar) {

        return lugaresFrecuentes.remove(lugar);
    }

    @Override
    public boolean investigar() {
        return true;
    }

}
