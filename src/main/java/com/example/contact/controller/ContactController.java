package com.example.contact.controller;
import com.example.contact.model.Contact; import com.example.contact.repository.ContactRepository;
import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/contacts")
public class ContactController{
private final ContactRepository repo; public ContactController(ContactRepository repo){this.repo=repo;}
@GetMapping public List<Contact> getAll(){return repo.findAll();}
@PostMapping public Contact create(@RequestBody Contact c){return repo.save(c);}
@DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}