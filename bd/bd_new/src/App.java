import DAO.UsuarioDAO;
import entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        Usuario u = new Usuario();

        u.setNome(1);
        u.setLogin("admin2");
        u.setSenha("admin3");
        u.setEmail("admin3@hotmail.com");

        new UsuarioDAO().cadastrarUsuario(u);
    }
}
