package Calculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SkylakeFrost
 */
public class OperacionMatematica {

    int valor1;
    int valor2;
    String operacion;

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    private double sumarNumeros() {
        return valor1 + valor2;
    }

    private double restarNumeros() {
        return valor1 - valor2;
    }

    private double multiplicarNumeros() {
        return valor1 * valor2;
    }

    private double dividirNumeros() {
        return valor1 / valor2;
    }

    public double aplicarOperacion(String operacion) {
        if (operacion.equals("+")) {
            return sumarNumeros();
        }
        if (operacion.equals("-")) {
            return restarNumeros();
        }
        if (operacion.equals("*")) {
            return multiplicarNumeros();
        }
        if (operacion.equals("/")) {
            return dividirNumeros();
        }
        return 0;
    }

}
