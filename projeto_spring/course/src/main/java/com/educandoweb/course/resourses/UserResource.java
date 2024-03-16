package com.educandoweb.course.resourses;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired // UserResource depende de UserService
    private UserService service;
    
    @GetMapping // Requisição do tipo GET
    public ResponseEntity<List> findAll(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User obj){ // Requisição do tipo POST <User> pois retorna um usuário
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri(); // Retorna o caminho do novo recurso criado
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){ // Requisição do tipo DELETE, <void> pois não retorna nada
        service.delete(id);
        return ResponseEntity.noContent().build(); 
    }

    @PutMapping (value = "/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj){ // Requisição do tipo PUT <User> pois retorna um usuário
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

}
