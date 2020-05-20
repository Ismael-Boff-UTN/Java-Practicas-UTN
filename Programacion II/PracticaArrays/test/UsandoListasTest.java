/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SkylakeFrost
 */
public class UsandoListasTest {
    
    public UsandoListasTest() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UsandoListas.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCargarLista() {
        System.out.println("cargarLista");
        List<Integer> lista = null;
        List<Integer> expResult = null;
        List<Integer> result = UsandoListas.cargarLista(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAutoCargarLista() {
        System.out.println("autoCargarLista");
        List<Integer> lista = null;
        List<Integer> expResult = null;
        List<Integer> result = UsandoListas.autoCargarLista(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMayorNumero() {
        System.out.println("mayorNumero");
        List<Integer> lista = null;
        int expResult = 0;
        int result = UsandoListas.mayorNumero(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMayorNumeroPrimo() {
        System.out.println("mayorNumeroPrimo");
        List<Integer> lista = null;
        String expResult = "";
        String result = UsandoListas.mayorNumeroPrimo(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testNumerosPrimosRandom() {
        System.out.println("numerosPrimosRandom");
        List<Integer> lista = null;
        List<Integer> expResult = null;
        List<Integer> result = UsandoListas.numerosPrimosRandom(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testFinalizadosEnDigito4() {
        System.out.println("finalizadosEnDigito4");
        List<Integer> lista = null;
        String expResult = "";
        String result = UsandoListas.finalizadosEnDigito4(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCuantasVecesSeRepiteElMayor() {
        System.out.println("cuantasVecesSeRepiteElMayor");
        List<Integer> lista = null;
        String expResult = "";
        String result = UsandoListas.cuantasVecesSeRepiteElMayor(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
