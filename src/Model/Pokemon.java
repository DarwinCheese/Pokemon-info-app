/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Laptop10
 */
public class Pokemon extends CartoonFigure{
    private String ability;
    private int hitpoints;
    private static int level = 100;
    private PokemonType type;
    private PokemonMove move;

    public Pokemon(String name, String ability, PokemonType type ,int hitpoints, PokemonMove move) {
        this.name = name;
        this.ability = ability;
        this.type = type;
        this.hitpoints = hitpoints;
        this.move = move;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int level) {
        Pokemon.level = level;
    }

    public PokemonMove getMove() {
        return move;
    }

    public void setMove(PokemonMove move) {
        this.move = move;
    }
    
    @Override
    public String speak(){
        return this.name;
    }
    
    
}
