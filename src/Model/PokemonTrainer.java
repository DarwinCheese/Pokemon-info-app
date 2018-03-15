/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Laptop10
 */
public class PokemonTrainer extends CartoonFigure{
    private String name;
    private int badges;
    private Pokemon pokemon;
    private char gender;

    public PokemonTrainer(String name, int badges, char gender) {
        this.name = name;
        this.badges = badges;
        this.gender = gender;
    }
    
    public PokemonTrainer(String name, int badges, Pokemon pokemon, char gender) {
        this.name = name;
        this.badges = badges;
        this.pokemon = pokemon;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public String speak(){
        return "I'm a pokemon trainer!";
    }
    
}
