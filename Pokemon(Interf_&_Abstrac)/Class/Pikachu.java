package Class;

import Interfaces.IElectrico;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu(int num_pokedex, String nombrePokemon, String pesoPokemon, String sexo, int temporadaQueAparece,
            String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
        
    }

    @Override
    public void atacarImpactrueno() {
        
        System.out.println("Soy Pikachu, y estoy atacando con Impactrueno!");
    }

    @Override
    public void atacarPunioTrueno() {
        
        System.out.println("Soy Pikachu, y estoy atacando con Puniotrueno!");
    }

    @Override
    public void atacarRayo() {
        
        System.out.println("Soy Pikachu, y estoy atacando con Rayo!");
    }

    @Override
    public void atacarRayoCarga() {
        
        System.out.println("Soy Pikachu, y estoy atacando con Rayo Carga!");
    }

    @Override
    public void atacarPlacaje() {
        
        System.out.println("Soy Pikachu, y estoy atacando con Placaje!");
    }

    @Override
    public void atacarArañazo() {
        
        System.out.println("Soy Pikachu, y estoy atacando con Arañazo!");
    }

    @Override
    public void atacarMordisco() {
       
        System.out.println("Soy Pikachu, y estoy atacando con Mordisco!");
    }
    
}
