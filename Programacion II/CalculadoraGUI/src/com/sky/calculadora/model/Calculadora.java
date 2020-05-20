package com.sky.calculadora.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SkylakeFrost
 */
public class Calculadora {

    private double firstValue;
    private double secondValue;
    private String operator;
    private List<String> listaCalculos = new ArrayList<>();

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public List<String> getListaCalculos() {
        return listaCalculos;
    }

    public void setListaCalculos(List<String> listaCalculos) {
        this.listaCalculos = listaCalculos;
    }

    public double add() {

        return firstValue + secondValue;

    }

    public double substract() {
        return firstValue - secondValue;
    }

    public double multuply() {
        return firstValue * secondValue;
    }

    public double divide() {
        return firstValue / secondValue;
    }

    public double squareRoot() {
        return Math.sqrt(firstValue);
    }
}
