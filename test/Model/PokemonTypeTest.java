/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laptop10
 */
public class PokemonTypeTest {
    
    public PokemonTypeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class PokemonType.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        PokemonType instance = new PokemonType("Fire");
        String expResult = "Fire";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class PokemonType.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Poison";
        PokemonType instance = new PokemonType("Grass");
        instance.setName(name);
    }
    
}
