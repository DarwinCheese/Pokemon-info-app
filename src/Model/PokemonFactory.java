/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Laptop10
 */
public class PokemonFactory {
   private Map<String, PokemonMove> moves;
   private Map<String, PokemonType> types;
   
 /**
 *
 * 
 */
   public ArrayList<Pokemon> getPokemons(){
       
       ArrayList<Pokemon> pokemons = new ArrayList();
       PokemonMoveFactory moveFactory = new PokemonMoveFactory();
       moves = moveFactory.getMoves();
       PokemonTypeFactory typeFactory = new PokemonTypeFactory();
       types = typeFactory.getTypes();
       
       Pokemon pokemon1 = new Pokemon("Bulbasaur", "??",types.get("Grass") ,200, moves.get("Vine Whip"));
       Pokemon pokemon2 = new Pokemon("Ivysaur", "??",types.get("Grass") ,230, moves.get("Leaf Storm"));
       Pokemon pokemon3 = new Pokemon("Venusaur", "??",types.get("Grass") ,270, moves.get("Solar Beam"));
       Pokemon pokemon4 = new Pokemon("Charmander", "??",types.get("Fire") ,188, moves.get("Ember"));
       Pokemon pokemon5 = new Pokemon("Charmeleon", "??",types.get("Fire") ,226, moves.get("Flamethrower"));
       Pokemon pokemon6 = new Pokemon("Charizard", "??",types.get("Fire") ,266, moves.get("Flare Blitz"));
       Pokemon pokemon7 = new Pokemon("Squirtle", "??",types.get("Water") ,198, moves.get("Water Gun"));
       Pokemon pokemon8 = new Pokemon("Wartortle", "??",types.get("Water") ,228, moves.get("Water Pulse"));
       Pokemon pokemon9 = new Pokemon("Blastoise", "??",types.get("Water") ,268, moves.get("Hydro Pump"));
       Pokemon pokemon10 = new Pokemon("Pikachu", "??",types.get("Electric") ,180, moves.get("ThunderBolt"));
       
       pokemons.add(pokemon1);
       pokemons.add(pokemon2);
       pokemons.add(pokemon3);
       pokemons.add(pokemon4);
       pokemons.add(pokemon5);
       pokemons.add(pokemon6);
       pokemons.add(pokemon7);
       pokemons.add(pokemon8);
       pokemons.add(pokemon9);
       pokemons.add(pokemon10);
       
       return pokemons;
   }
}
