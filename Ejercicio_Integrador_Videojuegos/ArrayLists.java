import java.util.ArrayList;
import java.util.List;

public class ArrayLists{
    
    public static void main(String[] args){

        //Crear el Arraylist de tipo "VideoJuego";
        List<VideoJuego> lista = new ArrayList<VideoJuego>();


        VideoJuego juego1 = new VideoJuego("32413", "CoD", "PS5", 8, "FPS");
        VideoJuego juego2 = new VideoJuego("54767", "Zelda", "Nintendo 64", 1, "MMO");
        VideoJuego juego3 = new VideoJuego("89794", "Skyrim", "Nintendo 64", 64, "MMO");
        VideoJuego juego4 = new VideoJuego("12345", "Left 4 Dead", "PC", 4, "Aventura");
        VideoJuego juego5 = new VideoJuego("23154", "7 Days to die", "PC", 16, "Supervivencia");

        //Agregamos info al ArrayList;
         lista.add(juego1);
         lista.add(juego2);
         lista.add(juego3);
         lista.add(juego4);
         lista.add(juego5);
         

        //Recorrer la lista;
        for( VideoJuego juego: lista){
            System.out.println("Juego:" + juego.getTitulo() + ", Consola:"+ juego.getConsola()+", Cant. Jug.:" + juego.getCantidadJugadores());
        }
    
        //Cambiamos el nombre y cant de jug de 2 videojuegos;
        juego1.setTitulo("CSGO");
        juego1.setCantidadJugadores(10);
        
        juego3.setTitulo("LoL");
        juego3.setCantidadJugadores(10);
        System.out.println(" ");
        System.out.println("Nueva lista: ");
        //Recorrer la nueva lista;
        for( VideoJuego juego: lista){
            System.out.println("Juego:" + juego.getTitulo() + ", Consola:"+ juego.getConsola()+", Cant. Jug.:" + juego.getCantidadJugadores());
        }
        
        
        System.out.println("  ");
        System.out.println("Juegos de Nintendo 64: ");
        //Recorremos el ArrayList y mostramos solo los juegos de Nintendo64;
        for(VideoJuego video: lista){
            if(video.getConsola().equals("Nintendo 64")){
                // System.out.println("Juego:" + video.getTitulo() + ", Consola:"+ video.getConsola()+", Cant. Jug.:" + video.getCantidadJugadores());uuuuuuuuuuuuuuuuuuuuu
                System.out.println(video.toString()); 
            }
        }

    
    }

   

    
}
