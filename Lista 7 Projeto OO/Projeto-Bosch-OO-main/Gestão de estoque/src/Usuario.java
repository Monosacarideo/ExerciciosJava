import java.util.ArrayList;

public class Usuario {
    private int idUsuario;
    private String senha, login;
    
  public ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();

    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    
}
