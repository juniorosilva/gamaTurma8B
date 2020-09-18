package br.edsonda.loja.dao;

import org.springframework.data.repository.CrudRepository;
import br.edsonda.loja.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
    public Usuario findByEmailAndSenha(String email, String senha);
    

}
