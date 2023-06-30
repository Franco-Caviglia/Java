import Class.Pikachu;
import Class.Charmander;
import Class.Bulbasaur;
import Class.Squirtle;

public class App{
    public static void main(String[] args){

        Pikachu pika = new Pikachu(23, "Pikachu", "3kg", "Masculino", 1, "Electrico");
        Charmander charmander = new Charmander(14, "Charmander", "4kg", "Masculino", 1, "Fuego");
        Bulbasaur bulbasaur = new Bulbasaur(45, "Bulbasaur", "3kg", "Femenino", 3, "Planta");
        Squirtle squirtle = new Squirtle(22, "Squirtle", "5kg", "Masculino", 3, "Agua");

        System.out.println("Pikachu, yo te elijo!");
        System.out.println("----");
        pika.atacarArañazo();
        System.out.println("----");
        pika.atacarMordisco();
        System.out.println("----");
        pika.atacarPlacaje();
        System.out.println("----");
        pika.atacarRayoCarga();
        System.out.println("----");
        pika.atacarPunioTrueno();
        System.out.println("----");
        pika.atacarImpactrueno();

        System.out.println("----");
        System.out.println("----");

        System.out.println("Charmander, yo te elijo!");
        System.out.println("----");
        charmander.atacarArañazo();
        System.out.println("----");
        charmander.atacarAscuas();
        System.out.println("----");
        charmander.atacarLanzallamas();
        System.out.println("----");
        charmander.atacarPunioFuego();
        System.out.println("----");
        charmander.atacarPlacaje();
        System.out.println("----");
        charmander.atacarMordisco();

        System.out.println("----");
        System.out.println("----");

        System.out.println("Squirtle, yo te elijo!");
        System.out.println("Info: " + "Numero de pokedex: "+ squirtle.getNum_pokedex() + ", " + "Temporada que aparece: " + squirtle.getTemporadaQueAparece());

        System.out.println("Bulbasaur, yo te elijo!");
        System.out.println("Info: " + "Numero de pokedex: "+ bulbasaur.getNum_pokedex() + ", " + "Temporada que aparece: " + bulbasaur.getTemporadaQueAparece());

        System.out.println("La temporada esta mal, aparece en la 2");

        //cambio temporada;
        bulbasaur.setTemporadaQueAparece(2);

        System.out.println("Temporada que aparece corregida: " + bulbasaur.getTemporadaQueAparece());

    }
}
