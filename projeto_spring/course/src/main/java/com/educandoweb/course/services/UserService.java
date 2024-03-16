package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositores.UserRepository;
import com.educandoweb.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
      //
      Optional<User> obj = repository.findById(id);
      return obj.orElseThrow(() -> new ResourceNotFoundException(id)); // tenta fazer o get, se não conseguir, lança a exceção
    }

    public User insert(User obj){
      return repository.save(obj);
    }

    public void delete(Long id){
      repository.deleteById(id);
    }

    public User update(Long id, User obj){
      User entity = repository.getReferenceById(id); // getReferenceById é um método que ainda não existe no UserRepository
      updateData(entity, obj);
      return repository.save(entity);
    }

    private void updateData(User entity, User obj) {
      entity.setName(obj.getName()); // Atualiza o nome do usuário
      entity.setEmail(obj.getEmail()); // Atualiza o email do usuário
      entity.setPhone(obj.getPhone()); // Atualiza o telefone do usuário
      throw new UnsupportedOperationException("Unimplemented method 'updateData'"); // Este método ainda não foi implementado
    }

}
