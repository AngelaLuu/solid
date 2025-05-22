package solid.srp;

public class ValidadorUsuario {
    public boolean validar(Usuario usuario) {
        return usuario.getNombre() != null && usuario.getEmail() != null;
    }
}
