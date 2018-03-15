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
public class PokemonMoveFactory {
    Map<String, PokemonMove> moves = new HashMap<String, PokemonMove>();
    
    public Map<String, PokemonMove> getMoves(){
        PokemonMove Flamethrower = new PokemonMove("Flamethrower", "Beam of flames", "Fire", 90);
        PokemonMove HydroPump = new PokemonMove("Hydro Pump", "Beam of water", "Water", 110);
        PokemonMove ThunderBolt = new PokemonMove("ThunderBolt", "Beam of flames", "Electric", 90);
        PokemonMove WaterPulse = new PokemonMove("Water Pulse", "Beam of water", "Water", 60);
        PokemonMove WaterGun = new PokemonMove("Water Gun", "Beam of flames", "Water", 40);
        PokemonMove Ember = new PokemonMove("Ember", "Beam of water", "Fire", 40);
        PokemonMove SolarBeam = new PokemonMove("Solar Beam", "Beam of flames", "Grass", 120);
        PokemonMove FlareBlitz = new PokemonMove("Flare Blitz", "Beam of water", "Fire", 120);
        PokemonMove VineWhip = new PokemonMove("Vine Whip", "Beam of flames", "Grass", 45);
        PokemonMove LeafStorm = new PokemonMove("Leaf Storm", "Beam of water", "Grass", 130);
        
        moves.put(Flamethrower.getName(), Flamethrower);
        moves.put(HydroPump.getName(), HydroPump);
        moves.put(ThunderBolt.getName(), ThunderBolt);
        moves.put(WaterPulse.getName(), WaterPulse);
        moves.put(WaterGun.getName(), WaterGun);
        moves.put(Ember.getName(), Ember);
        moves.put(SolarBeam.getName(), SolarBeam);
        moves.put(FlareBlitz.getName(), FlareBlitz);
        moves.put(VineWhip.getName(), VineWhip);
        moves.put(LeafStorm.getName(), LeafStorm);
        
        return moves;
    }
}
