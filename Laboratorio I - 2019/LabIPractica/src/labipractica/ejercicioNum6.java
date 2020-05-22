
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ismael Boff Lopez (Skylake)
 */
public class ejercicioNum6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double sueldo;
        double horasTrabajadas;
        int horasEntrada;
        int horasSalida;
        int minutosEntrada;
        int minutosSalida;
        System.out.println("Ingrese la hora a la que ingreso el empleado y los minutos, separandolos por un 'enter'.");
        horasEntrada = s.nextInt();
        minutosEntrada = s.nextInt();
        double entrada = (horasEntrada * 60) + minutosEntrada;
        System.out.println("Ingrese la hora a la que salio el empleado y los minutos, separandolos por un 'enter'.");
        horasSalida = s.nextInt();
        minutosSalida = s.nextInt();
        double salida = (horasSalida * 60) + minutosSalida;
        if (salida <= 480) {
            salida = salida + 1440;
        }
        horasTrabajadas = (salida - entrada) / 60;
        if (horasTrabajadas <= 8) {
            if (horasEntrada >= 8 && horasEntrada <= 20) {
                if (entrada > salida) {
                    sueldo = horasTrabajadas * 10;
                    System.out.println("Trabajo " + horasTrabajadas + " horas, y le corresponde un sueldo de: $" + sueldo);
                } else {
                    sueldo = horasTrabajadas * 10;
                    System.out.println("Trabajo " + horasTrabajadas + " horas, y le corresponde un sueldo de: $" + sueldo);
                }
            } else {
                if (entrada > salida) {
                    sueldo = horasTrabajadas * 15;
                    System.out.println("Trabajo " + horasTrabajadas + " horas, y le corresponde un sueldo de: $" + sueldo);
                } else {
                    sueldo = horasTrabajadas * 15;
                    System.out.println("Trabajo " + horasTrabajadas + " horas, y le corresponde un sueldo de: $" + sueldo);
                }
            }
        } else {
            System.out.println("Las horas trabajadas no pueden superar las 8 horas.");
        }
    }

}
