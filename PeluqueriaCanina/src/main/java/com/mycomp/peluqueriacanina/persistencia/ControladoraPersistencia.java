package com.mycomp.peluqueriacanina.persistencia;

import com.mycomp.peluqueriacanina.logica.Duenio;
import com.mycomp.peluqueriacanina.logica.Mascota;
import java.util.List;

public class ControladoraPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        //Creamos dueño en la BD;
        duenioJpa.create(duenio);
        //Creamos mascota en la BD;
        mascoJpa.create(masco);
        
    }

    public List<Mascota> traerMascotas() {
        
        return mascoJpa.findMascotaEntities();//Busca todos los registros de nuestra tabla mascota y lo que encuentre se lo retorna a la controladora de la logica;
    }
    
    
}
