package es.mde.entidades;

public class Federado extends Jugador{
    
    private boolean profesional;
    private float handicap; 
    
    public Federado() {}

    public boolean isProfesional() {
        return profesional;
    }

    public void setProfesional(boolean profesional) {
        this.profesional = profesional;
    }
    
    @Override
    public float getHandicap() {
        return handicap;
    }

    public void setHandicap(float handicap) {
        this.handicap = handicap;
    }

    @Override
    public String getTipo() {
        return "Federado";
    } 
    
}
