
import java.util.Scanner;


/**
 *
 * @author SkylakeFrost
 */
public class ej1 {
    public static void main(String[] args) {
        
        System.out.println("---------------------------");
        System.out.println("Ingrese Un valor decimal : ");
        System.out.println("---------------------------");
        Scanner sc = new Scanner(System.in);
        double valorDecimal = sc.nextDouble();
        
        casting(valorDecimal);
        
        
        
    }
    
    public static void casting (double valorDecimal){
        
        short valorShort = (short)valorDecimal;
        System.out.println("------------------------------------");
        System.out.println("Valor decimal a short : " +valorShort);
        
        int valorInt = (int)valorDecimal;
        System.out.println("------------------------------------");
        System.out.println("Valor decimal a int : " +valorInt);
        
        String valorStr = Double.toString(valorDecimal);
        System.out.println("------------------------------------");
        System.out.println("Valor decimal a String : " +valorStr);
        
        long valorLong = (long)valorDecimal;
        System.out.println("------------------------------------");
        System.out.println("Valor decimal a long : " +valorLong);
        
        float valorFloat = (float)valorDecimal;
        System.out.println("------------------------------------");
        System.out.println("Valor decimal a float : " +valorFloat);
        System.out.println("------------------------------------");
        
        
    }
}
