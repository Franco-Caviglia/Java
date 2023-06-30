package Class;

public abstract class Pokemon {
    int num_pokedex;
    String nombrePokemon;
    String pesoPokemon;
    String sexo;
    int temporadaQueAparece;
    String tipo;


    public Pokemon(int num_pokedex, String nombrePokemon, String pesoPokemon, String sexo, int temporadaQueAparece,
            String tipo) {
        this.num_pokedex = num_pokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporadaQueAparece = temporadaQueAparece;
        this.tipo = tipo;
    }


    public String getNombrePokemon() {
        return nombrePokemon;
    }
    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }


    public String getPesoPokemon() {
        return pesoPokemon;
    }
    public void setPesoPokemon(String pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }


    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public int getTemporadaQueAparece() {
        return temporadaQueAparece;
    }
    public void setTemporadaQueAparece(int temporadaQueAparece) {
        this.temporadaQueAparece = temporadaQueAparece;
    }


    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public int getNum_pokedex() {
        return num_pokedex;
    }
    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    
    //metodos;
    public abstract void atacarPlacaje();

    public abstract void atacarArañazo();

    public abstract void atacarMordisco();
}


    