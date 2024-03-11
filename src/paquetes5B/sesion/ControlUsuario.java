package paquetes5B.sesion;
public class ControlUsuario {
    private int numusuarios = 0;
    private Usuario[] usuarios;

    public ControlUsuario() {
        this.usuarios = new Usuario[10];
    }

    public void addUsuario(String usuario, String pass, String nombre) {
        this.usuarios[numusuarios] = new Usuario(usuario, pass, nombre);
      numusuarios ++;
    }

    public String getUsuario(int id) {
        return usuarios [id].getUsuarios();
    }
}
