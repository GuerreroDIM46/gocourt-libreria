package es.mde.entidades;

public abstract class Jugador {

    private Long id;
    private String nombre, apellido1, apellido2, dni, telefono, email, campoUrl, jugadorUrl;
    private Campo campo;
    
    public Jugador() {}
    
    public abstract float getHandicap();
    
    public abstract String getTipo();

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

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Campo getCampo() {
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    public String getCampoUrl() {
        return campoUrl;
    }

    public void setCampoUrl(String campoUrl) {
        this.campoUrl = campoUrl;
    }

    public String getJugadorUrl() {
        return jugadorUrl;
    }

    public void setJugadorUrl(String jugadorUrl) {
        this.jugadorUrl = jugadorUrl;
    }   
    
}
