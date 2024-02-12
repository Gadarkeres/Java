package DAO;

import java.sql.PreparedStatement;

import conexao.Conexao;
import entity.Usuario;

public class UsuarioDAO {
    public void cadastrarUsuario(Usuario usuario) {
        
        String sql = "INSERT INTO usuarios (nome, login, senha, email) VALUES (?, ?, ?, ?)";

        PreparedStatement stmt = null;

       try {
        stmt = Conexao.getConexao().prepareStatement(sql);
        stmt.setInt(1, usuario.getNome());
        stmt.setString(2, usuario.getLogin());
        stmt.setString(3, usuario.getSenha());
        stmt.setString(4, usuario.getEmail());

        stmt.execute();
        stmt.close();

       } catch (Exception e) {
         e.printStackTrace();
       }



    }
}
