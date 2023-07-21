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

    public Mascota traerMascota(int num_cliente) {
       return controlPersis.traerMascotas(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, String nombreDuenio, String celDuenio, String alergico, String atenEsp) {
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAtencion_especial(atenEsp);
        masco.setAlergico(alergico);
        
        //modifico la mascota;
        controlPersis.modificarMascota(masco);
        
        //Identificar dueño y setear nuevos valores;
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        dueno.setCelDuenio(celDuenio);
        dueno.setNombre(nombreDuenio);
        
        //llamar modificar dueño;
        this.modificarDuenio(dueno);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }
}
