package com.sky.calculadora.controller;

import com.sky.calculadora.model.Calculadora;
import com.sky.calculadora.view.CalculadoraView;
import com.sky.calculadora.view.LogView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SkylakeFrost
 */
public class CalculatorController implements ActionListener {

    private CalculadoraView calculatorView;
    private LogView logView;
    private Calculadora calculatorModel;

    @SuppressWarnings("LeakingThisInConstructor")
    public CalculatorController(CalculadoraView calculatorView, Calculadora calculatorModel, LogView logView) {
        this.calculatorView = calculatorView;
        this.calculatorModel = calculatorModel;
        this.logView = logView;
        //Result Panel
        this.calculatorView.getTxtResultado().addActionListener(this);
        //Botonera
        this.calculatorView.getBtn0().addActionListener(this);
        this.calculatorView.getBtn1().addActionListener(this);
        this.calculatorView.getBtn2().addActionListener(this);
        this.calculatorView.getBtn3().addActionListener(this);
        this.calculatorView.getBtn4().addActionListener(this);
        this.calculatorView.getBtn5().addActionListener(this);
        this.calculatorView.getBtn6().addActionListener(this);
        this.calculatorView.getBtn7().addActionListener(this);
        this.calculatorView.getBtn8().addActionListener(this);
        this.calculatorView.getBtn9().addActionListener(this);
        //Other Buttons
        this.calculatorView.getBtnComma().addActionListener(this);
        this.calculatorView.getBtnClean().addActionListener(this);
        this.calculatorView.getBtnLog().addActionListener(this);
        this.calculatorView.getBtnBack().addActionListener(this);
        //Operators
        this.calculatorView.getBtnAdd().addActionListener(this);
        this.calculatorView.getBtnSubstract().addActionListener(this);
        this.calculatorView.getBtnMultiply().addActionListener(this);
        this.calculatorView.getBtnDivide().addActionListener(this);
        this.calculatorView.getBtnRoot().addActionListener(this);
        this.calculatorView.getBtnEqual().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Botonera 0 - 9
        if (e.getSource() == calculatorView.getBtn0()) {
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "0");
        }
        if (e.getSource() == calculatorView.getBtn1()) {
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "1");
        }
        if (e.getSource() == calculatorView.getBtn2()) {
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "2");
        }
        if (e.getSource() == calculatorView.getBtn3()) {
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "3");
        }
        if (e.getSource() == calculatorView.getBtn4()) {
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "4");
        }
        if (e.getSource() == calculatorView.getBtn5()) {
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "5");
        }
        if (e.getSource() == calculatorView.getBtn6()) {
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "6");
        }
        if (e.getSource() == calculatorView.getBtn7()) {
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "7");
        }
        if (e.getSource() == calculatorView.getBtn8()) {
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "8");
        }
        if (e.getSource() == calculatorView.getBtn9()) {
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "9");
        }
        if (e.getSource() == calculatorView.getBtnComma()) {
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + ".");
        }

        //Operaciones
        if (e.getSource() == calculatorView.getBtnAdd()) {
            calculatorModel.setFirstValue(Double.valueOf(calculatorView.getTxtResultado().getText()));
            calculatorModel.setOperator("+");
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "+");
            calculatorModel.getListaCalculos().add(calculatorView.getTxtResultado().getText());
        }
        if (e.getSource() == calculatorView.getBtnSubstract()) {
            calculatorModel.setFirstValue(Double.valueOf(calculatorView.getTxtResultado().getText()));
            calculatorModel.setOperator("-");
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "-");
        }
        if (e.getSource() == calculatorView.getBtnMultiply()) {
            calculatorModel.setFirstValue(Double.valueOf(calculatorView.getTxtResultado().getText()));
            calculatorModel.setOperator("*");
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "X");
        }
        if (e.getSource() == calculatorView.getBtnDivide()) {
            calculatorModel.setFirstValue(Double.valueOf(calculatorView.getTxtResultado().getText()));
            calculatorModel.setOperator("/");
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "/");
        }
        if (e.getSource() == calculatorView.getBtnRoot()) {
            calculatorView.getTxtResultado().setText(calculatorView.getTxtResultado().getText() + "√");
            calculatorModel.setOperator("√");

        }

        //Equal
        if (e.getSource() == calculatorView.getBtnEqual()) {
            String[] secondValue;

            switch (calculatorModel.getOperator()) {
                case "+":
                    //Se Obtiene El Segundo Valor
                    secondValue = calculatorView.getTxtResultado().getText().split("\\+");

                    calculatorModel.setSecondValue(Double.valueOf(secondValue[1]));
                    calculatorView.getTxtResultado().setText(String.valueOf(calculatorModel.add()));

                    calculatorModel.getListaCalculos().add(calculatorView.getTxtResultado().getText());

                case "-":
                    //Se Obtiene El Segundo Valor
                    secondValue = calculatorView.getTxtResultado().getText().split("-");

                    calculatorModel.setSecondValue(Double.valueOf(secondValue[1]));
                    calculatorView.getTxtResultado().setText(String.valueOf(calculatorModel.substract()));
                case "*":
                    //Se Obtiene El Segundo Valor
                    secondValue = calculatorView.getTxtResultado().getText().split("X");

                    calculatorModel.setSecondValue(Double.valueOf(secondValue[1]));
                    calculatorView.getTxtResultado().setText(String.valueOf(calculatorModel.multuply()));
                case "/":
                    //Se Obtiene El Segundo Valor
                    secondValue = calculatorView.getTxtResultado().getText().split("/");

                    calculatorModel.setSecondValue(Double.valueOf(secondValue[1]));
                    calculatorView.getTxtResultado().setText(String.valueOf(calculatorModel.divide()));
                case "√":
                    //Se Obtiene El Valor Para La Raiz Cuadrada
                    secondValue = calculatorView.getTxtResultado().getText().split("√");

                    calculatorModel.setFirstValue(Double.valueOf(secondValue[1]));
                    calculatorView.getTxtResultado().setText(String.valueOf(calculatorModel.squareRoot()));
            }
        }
        //Boton Borrar Todo O Parcial
        if (e.getSource() == calculatorView.getBtnClean()) {
            calculatorView.getTxtResultado().setText("");
        }
        if (e.getSource() == calculatorView.getBtnBack()) {
            String initial = calculatorView.getTxtResultado().getText();
            calculatorView.getTxtResultado().setText(initial.substring(0, initial.length() - 1));
        }

        //Log
        if (e.getSource() == calculatorView.getBtnLog()) {

            for (String calculo : calculatorModel.getListaCalculos()) {
                logView.getTxtListaCalculos().setText(calculo + "\n");
            }

            logView.setVisible(true);
        }
    }

    public void iniciarVista() {
        calculatorView.setLocationRelativeTo(null);
        calculatorView.setVisible(true);
        logView.setLocationRelativeTo(null);
    }

}
