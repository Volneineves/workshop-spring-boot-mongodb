package com.volneineves.workshopmongo.resources;

import com.volneineves.workshopmongo.domain.User;
import com.volneineves.workshopmongo.dto.UserDTO;
import com.volneineves.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET) // Pode-se usar o @GetMapping também
    public ResponseEntity<List<UserDTO>> findAll(){
        List<User> list = service.findAll();
        List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList()); // Estudar como foi feita essa conversão, não entendi bem
        return ResponseEntity.ok().body(listDto);
    }
}
