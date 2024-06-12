package es.mde.entidades;

import java.util.ArrayList;
import java.util.Collection;

public class Campo {
    
    private Long id;    
    private String nombre, provincia, jugadoresUrl;
    private float valorCampo, valorSlope;
    private Collection<Jugador> jugadores = new ArrayList<>();
    
    public Campo() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public float getValorCampo() {
        return valorCampo;
    }

    public void setValorCampo(float valorCampo) {
        this.valorCampo = valorCampo;
    }

    public float getValorSlope() {
        return valorSlope;
    }

    public void setValorSlope(float valorSlope) {
        this.valorSlope = valorSlope;
    }    

    public String getJugadoresUrl() {
        return jugadoresUrl;
    }

    public void setJugadoresUrl(String jugadoresUrl) {
        this.jugadoresUrl = jugadoresUrl;
    }

    public Collection<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Collection<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
}
