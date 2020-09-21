package br.paduan.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.controle.dao.UsuarioDAO;
import br.paduan.controle.model.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin("*")
public class UsuarioController {
    @Autowired
    private UsuarioDAO dao;

    @GetMapping("/usuarios")
    public List<Usuario> buscarTodos(){
        List<Usuario> lista = (List<Usuario>)dao.findAll();
        return lista;
    }

    //Fazer um endpoint do tipo POST para efetuar login no sistema

    @PostMapping("/usuario/login")
    public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario user) {
        //Usuario usuario = dao.findByUsuarioAndSenha(user.getNome(), user.getSenha());
        Usuario usuario = dao.findByEmailAndSenha(user.getEmail(), user.getSenha());
        if (usuario != null){
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.status(403).build();
        }
        
    }
    

    
}
