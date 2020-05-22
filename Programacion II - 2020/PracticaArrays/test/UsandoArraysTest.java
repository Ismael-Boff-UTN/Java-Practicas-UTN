/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SkylakeFrost
 */
public class UsandoArraysTest {
    
    public UsandoArraysTest() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UsandoArrays.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMayorNumero() {
        System.out.println("mayorNumero");
        int[] array = null;
        UsandoArrays.mayorNumero(array);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMayorNum() {
        System.out.println("mayorNum");
        int[] array = null;
        int expResult = 0;
        int result = UsandoArrays.mayorNum(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMayorNumeroPrimo() {
        System.out.println("mayorNumeroPrimo");
        int[] array = null;
        UsandoArrays.mayorNumeroPrimo(array);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCargarPrimosRandom() {
        System.out.println("cargarPrimosRandom");
        int[] array = null;
        int[] expResult = null;
        int[] result = UsandoArrays.cargarPrimosRandom(array);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testFinalizaEnDigito4() {
        System.out.println("finalizaEnDigito4");
        int[] array = null;
        String expResult = "";
        String result = UsandoArrays.finalizaEnDigito4(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMayorNumeroRepetido() {
        System.out.println("mayorNumeroRepetido");
        int[] array = null;
        String expResult = "";
        String result = UsandoArrays.mayorNumeroRepetido(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMenuOpciones() {
        System.out.println("MenuOpciones");
        UsandoArrays.MenuOpciones();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
