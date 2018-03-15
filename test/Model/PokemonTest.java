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
public class PokemonTest {
    
    private PokemonType typeGrass = new PokemonType("Grass");
    private PokemonType typeFire = new PokemonType("Fire");
    private PokemonMove move = new PokemonMove("VineWhip", "??", "Grass", 0);
    
    
    public PokemonTest() {
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
     * Test of getType method, of class Pokemon.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Pokemon instance = new Pokemon("Bulbasaur", "Chlorophyll", typeGrass ,200, move);
        PokemonType expResult = typeGrass;
        PokemonType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setType method, of class Pokemon.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        PokemonType type = typeFire;
        Pokemon instance = new Pokemon("Bulbasaur", "Chlorophyll", typeGrass ,200, move);
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getName method, of class Pokemon.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Pokemon instance = new Pokemon("Bulbasaur", "Chlorophyll", typeGrass ,200, move);
        String expResult = "Bulbasaur";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setName method, of class Pokemon.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Pokemon instance = new Pokemon("Bulbasaur", "Chlorophyll", typeGrass ,200, move);
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAbility method, of class Pokemon.
     */
    @Test
    public void testGetAbility() {
        System.out.println("getAbility");
        Pokemon instance = new Pokemon("Bulbasaur", "Chlorophyll", typeGrass ,200, move);
        String expResult = "Chlorophyll";
        String result = instance.getAbility();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setAbility method, of class Pokemon.
     */
    @Test
    public void testSetAbility() {
        System.out.println("setAbility");
        String ability = "";
        Pokemon instance = new Pokemon("Bulbasaur", "Chlorophyll", typeGrass ,200, move);
        instance.setAbility(ability);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getHitpoints method, of class Pokemon.
     */
    @Test
    public void testGetHitpoints() {
        System.out.println("getHitpoints");
        Pokemon instance = new Pokemon("Bulbasaur", "Chlorophyll", typeGrass ,200, move);
        int expResult = 200;
        int result = instance.getHitpoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setHitpoints method, of class Pokemon.
     */
    @Test
    public void testSetHitpoints() {
        System.out.println("setHitpoints");
        int hitpoints = 99;
        Pokemon instance = new Pokemon("Bulbasaur", "Chlorophyll", typeGrass ,200, move);
        instance.setHitpoints(hitpoints);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getLevel method, of class Pokemon.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        int expResult = 100;
        Pokemon instance = new Pokemon("Bulbasaur", "Chlorophyll", typeGrass ,200, move);
        int result = instance.getLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setLevel method, of class Pokemon.
     */
    @Test
    public void testSetLevel() {
        System.out.println("setLevel");
        int level = 100;
        Pokemon.setLevel(level);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMove method, of class Pokemon.
     */
    @Test
    public void testGetMove() {
        System.out.println("getMove");
        PokemonMove expResult = move;
        Pokemon instance = new Pokemon("Bulbasaur", "Chlorophyll", typeGrass ,200, move);
        PokemonMove result = instance.getMove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMove method, of class Pokemon.
     */
    @Test
    public void testSetMove() {
        System.out.println("setMove");
        PokemonMove move = new PokemonMove("Leaf Storm", "??", "Grass", 0);
        Pokemon instance = new Pokemon("Bulbasaur", "Chlorophyll", typeGrass ,200, move);
        instance.setMove(move);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of speak method, of class Pokemon.
     */
    @Test
    public void testSpeak() {
        System.out.println("speak");
        String expResult = "Bulbasaur";
        Pokemon instance = new Pokemon("Bulbasaur", "Chlorophyll", typeGrass ,200, move);
        String result = instance.speak();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
