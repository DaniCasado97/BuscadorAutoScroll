/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscadorscroll;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Casado
 */
class Personas {

    protected static List<Persona> DameListaComodin() {

        List<Persona> lista = new ArrayList<>();

        lista.add(new Persona("Elisabeth","Salguero","Fundadora"));
        
        lista.add(new Persona("Abraham","Barea","Director Ejecutivo"));
        
        lista.add(new Persona("Emilia","Montilla","Operaciones"));
        lista.add(new Persona("Fernando","Vallejo","Operaciones"));
        lista.add(new Persona("Iris","Berenguer","Operaciones"));
        lista.add(new Persona("Pedro","García","Operaciones"));
        lista.add(new Persona("Salvadora","Lema","Operaciones"));
        lista.add(new Persona("José","Casado","Operaciones"));
        
        lista.add(new Persona("Santos","Quintero","Marketing"));
        lista.add(new Persona("Remedios","Ocaña","Marketing"));
        lista.add(new Persona("Asier","Torralba","Marketing"));
        lista.add(new Persona("Laia","Jover","Marketing"));
        lista.add(new Persona("Justo","Fernandez","Marketing"));
        lista.add(new Persona("Salma","Nuñez","Marketing"));
        
        lista.add(new Persona("Cayetana","Domingo","Recursos Humanos"));
        lista.add(new Persona("Emilio","Calderón","Recursos Humanos"));
        lista.add(new Persona("Mercedes","Piñeiro","Recursos Humanos"));
        lista.add(new Persona("Gregorio","Martinez","Recursos Humanos"));
        lista.add(new Persona("Luna","Santos","Recursos Humanos"));
        lista.add(new Persona("Dario","García","Recursos Humanos"));
        
        return lista;
    }
}

class Persona {
    
    String nombre;
    String apellido;
    String sector;

    public Persona(String nombre, String apellido, String sector) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sector = sector;
    }
    
}
