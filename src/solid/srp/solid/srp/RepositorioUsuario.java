package solid.srp;

public class RepositorioUsuario {
    public void guardar(Usuario usuario) {
        System.out.println("Guardando usuario: " + usuario.getNombre());
    }
}
