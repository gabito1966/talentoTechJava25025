package techlab.practicas.p6;

public class Cliente {
    private String nombre;
    private String email;

    public Cliente(){}

    public Cliente(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email.contains ("@")) {
            this.email = email;
        }
    }
}
