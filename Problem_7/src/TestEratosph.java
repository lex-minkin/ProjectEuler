/**
 * Created by adm on 08.06.2014.
 */


import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class TestEratosph {
    @Test
    public void testNegativeNumber(){
        PrimeNumbersEratosph pner = new PrimeNumbersEratosph();
        pner.findPrimeNumbers(-5);
        ArrayList<Integer> result = pner.getPrimeList();
        assertNotNull(result);
        assertEquals(result.size(), 0);
    }

    @Test
    public void TestZero(){
        PrimeNumbersEratosph pner = new PrimeNumbersEratosph();
        pner.findPrimeNumbers(0);
        ArrayList<Integer> result = pner.getPrimeList();
        assertNotNull(result);
        assertEquals(result.size(), 0);
    }

    @Test
    public void TestOne(){
        PrimeNumbersEratosph pner = new PrimeNumbersEratosph();
        pner.findPrimeNumbers(1);
        ArrayList<Integer> result = pner.getPrimeList();
        assertNotNull(result);
        assertEquals(result.size(), 0);
    }

    @Test
    public void TestTwo(){
        PrimeNumbersEratosph pner = new PrimeNumbersEratosph();
        pner.findPrimeNumbers(2);
        Integer expectedPrimeNumber = 2;
        ArrayList<Integer> result = pner.getPrimeList();
        assertNotNull(result);
        assertEquals(result.size(), 1);
        assertEquals(result.get(0), expectedPrimeNumber);

    }

    @Test
    public void TestTwenty(){
        PrimeNumbersEratosph pner = new PrimeNumbersEratosph();
        pner.findPrimeNumbers(20);
        Integer[] expectedPrimeNumberList  = {2, 3, 5, 7, 11, 13, 17, 19};
        ArrayList<Integer> result = pner.getPrimeList();
        assertNotNull(result);
        assertEquals(result.size(), 8);
        for(int i = 0; i < 8; i++)
            assertEquals(result.get(i), expectedPrimeNumberList[i]);

    }
}
