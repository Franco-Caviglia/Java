package com.mycomp.peluqueriacanina.logica;

import com.mycomp.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, 
            String color, String observaciones, String nombreDuenio, 
            String celDuenio, String alergico, String atenEsp) {
        
            Duenio duenio = new Duenio();
            //Creamos el dueño y asignamos valores;
            duenio.setNombre(nombreDuenio);
            duenio.setCelDuenio(celDuenio);
            
            
            
            //Creamos mascota y asignamos valores;
            Mascota masco = new Mascota();
            
            masco.setColor(color);
            masco.setNombre(nombreMasco);
            masco.setRaza(raza);
            masco.setAlergico(alergico);
            masco.setAtencion_especial(atenEsp);
            masco.setObservaciones(observaciones);
            masco.setUnDuenio(duenio);
            
            controlPersis.guardar(duenio, masco);
    }

    public List<Mascota> traerMascotas() {
       
        return controlPersis.traerMascotas();
        
        
        
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }
}
