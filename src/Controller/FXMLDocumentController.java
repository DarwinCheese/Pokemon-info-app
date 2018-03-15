/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pokemon;
import Model.PokemonFactory;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javax.swing.JOptionPane;

/**
 *
 * @author Laptop10
 */
public class FXMLDocumentController implements Initializable {
    @FXML 
    private Label pokemonNameLabel; 
    @FXML 
    private Label pokemonTypeLabel;
    @FXML 
    private Label pokemonMoveLabel;
    @FXML 
    private ListView pokemonListView;
    @FXML 
    private ArrayList<Pokemon> pokemons;   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        PokemonFactory pokemonFactory = new PokemonFactory();   
        pokemons = pokemonFactory.getPokemons();
        
        ObservableList<String> pokemonList = FXCollections.observableArrayList();
        
        for(Pokemon pokemon : pokemons) {
            pokemonList.add(pokemons.indexOf(pokemon),  pokemon.speak());
        }
        
        try{
            pokemonListView.setItems(pokemonList);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "De pokemon lijst bevat een fout - De applicatie sluit nu af - Check de console voor de error(s).");
            System.out.println(e);
            System.exit(0);
        }
        
        pokemonListView.getSelectionModel().selectedItemProperty().addListener(
            new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
                   int sel = pokemonListView.getSelectionModel().getSelectedIndex();
                   Pokemon pokemon = pokemons.get(sel);
                   pokemonNameLabel.setText(pokemon.getName());
                   pokemonTypeLabel.setText(pokemon.getType().getName());
                   pokemonMoveLabel.setText(pokemon.getMove().getName());
            } 
        });
    }
}
