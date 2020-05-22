package com.sky.calculadora.controller;

import com.sky.calculadora.model.Calculadora;
import com.sky.calculadora.view.CalculadoraView;
import com.sky.calculadora.view.LogView;

/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {
        Calculadora calModel = new Calculadora();
        CalculadoraView calView = new CalculadoraView();
        LogView logView = new LogView();

        CalculatorController calController = new CalculatorController(calView, calModel, logView);
        calController.iniciarVista();

        
    }

}
