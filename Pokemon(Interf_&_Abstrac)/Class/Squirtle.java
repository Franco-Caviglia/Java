package Class;

import Interfaces.IAgua;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle(int num_pokedex, String nombrePokemon, String pesoPokemon, String sexo, int temporadaQueAparece,
            String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
        
    }

    @Override
    public void atacarHidrobomba() {
        
        System.out.println("Soy Squirtle, y estoy atacando con HidroBomba!");
    }

    @Override
    public void atacarPistolaAgua() {
        
        System.out.println("Soy Squirtle, y estoy atacando con Pistola Agua!");
    }

    @Override
    public void atacarBurbuja() {
        
        System.out.println("Soy Squirtle, y estoy atacando con Burbuja!");
    }

    @Override
    public void atacarHidropulso() {
        
        System.out.println("Soy Squirtle, y estoy atacando con Hidropulso!");
    }

    @Override
    public void atacarPlacaje() {
        
        System.out.println("Soy Squirtle, y estoy atacando con Placaje!");
    }

    @Override
    public void atacarArañazo() {
        
        System.out.println("Soy Squirtle, y estoy atacando con Arañazo!");
    }

    @Override
    public void atacarMordisco() {
        
        System.out.println("Soy Squirtle, y estoy atacando con Mordisco!");
    }
    
}
