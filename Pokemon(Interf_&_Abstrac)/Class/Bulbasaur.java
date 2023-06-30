package Class;

import Interfaces.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur(int num_pokedex, String nombrePokemon, String pesoPokemon, String sexo, int temporadaQueAparece,
            String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
        
    }

    @Override
    public void atacarParalizar() {
        
        System.out.println("Soy Bulbasaur, y estoy atacando con Paralizar!");
    }

    @Override
    public void atacarDrenaje() {
        
        System.out.println("Soy Bulbasaur, y estoy atacando con Drenaje!");
    }

    @Override
    public void atacarHojaAfilada() {
        
        System.out.println("Soy Bulbasaur, y estoy atacando con Hoja Afilada!");
    }

    @Override
    public void atacarLatigoCepa() {
        
        System.out.println("Soy Bulbasaur, y estoy atacando con Latigo Cepa!");
    }

    @Override
    public void atacarPlacaje() {
        
        System.out.println("Soy Bulbasaur, y estoy atacando con Placaje!");
    }

    @Override
    public void atacarArañazo() {
        
        System.out.println("Soy Bulbasaur, y estoy atacando con Arañazo!");
    }

    @Override
    public void atacarMordisco() {
        
        System.out.println("Soy Bulbasaur, y estoy atacando con Mordisco!");
    }
    
    

}
