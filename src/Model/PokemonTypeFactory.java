/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Laptop10
 */
public class PokemonTypeFactory {
    private Map<String, PokemonType> types = new HashMap<String, PokemonType>();
    
    public Map<String, PokemonType> getTypes(){
        PokemonType normal = new PokemonType("Normal");
        PokemonType fighting = new PokemonType("Fighting");
        PokemonType flying = new PokemonType("Flying");
        PokemonType poison = new PokemonType("Poison");
        PokemonType ground = new PokemonType("Ground");
        PokemonType rock = new PokemonType("Rock");
        PokemonType bug = new PokemonType("Bug");
        PokemonType ghost = new PokemonType("Ghost");
        PokemonType steel = new PokemonType("Steel");
        PokemonType fire = new PokemonType("Fire");
        PokemonType water = new PokemonType("Water");
        PokemonType grass = new PokemonType("Grass");
        PokemonType electric = new PokemonType("Electric");
        PokemonType psychic = new PokemonType("Psychic");
        PokemonType ice = new PokemonType("Ice");
        PokemonType dragon = new PokemonType("Dragon");
        PokemonType dark = new PokemonType("Dark");
        PokemonType fairy = new PokemonType("Fairy");
        PokemonType shadow = new PokemonType("Shadow");
        
        types.put(normal.getName(), normal);
        types.put(fighting.getName(), fighting);
        types.put(flying.getName(), flying);
        types.put(poison.getName(), poison);
        types.put(ground.getName(), ground);
        types.put(rock.getName(), rock);
        types.put(bug.getName(), bug);
        types.put(ghost.getName(), ghost);
        types.put(steel.getName(), steel);
        types.put(fire.getName(), fire);
        types.put(water.getName(), water);
        types.put(grass.getName(), grass);
        types.put(electric.getName(), electric);
        types.put(psychic.getName(), psychic);
        types.put(ice.getName(), ice);
        types.put(dragon.getName(), dragon);
        types.put(dark.getName(), dark);
        types.put(fairy.getName(), fairy);
        types.put(shadow.getName(), shadow);
        
        return types;
    }
}
