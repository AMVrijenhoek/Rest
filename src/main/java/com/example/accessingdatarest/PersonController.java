package com.example.accessingdatarest;

import javax.validation.Valid;

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

@RestController
@RequestMapping("/people")
public class PersonController {

    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public ResponseEntity<Iterable<Person>> getAll() {
        return ResponseEntity.ok(personRepository.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable Long id) {
        return ResponseEntity.ok(personRepository.findById(id).get());
    }

    @PutMapping(path ="/{id}")
    public ResponseEntity<Person> patchPerson(@PathVariable Long id, @RequestBody @Valid Person newPerson){
        Person person = personRepository.findById(id).get();

        person.setAge(newPerson.getAge());
        person.setName(newPerson.getName());
        person.setActive(newPerson.getActive());

        return ResponseEntity.ok(personRepository.save(person));
    }

    @PostMapping
    public ResponseEntity<Person> postPerson(@RequestBody @Valid Person person) {
        return ResponseEntity.ok(personRepository.save(person));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable Long id) {
        Person person = personRepository.findById(id).get();
        personRepository.delete(person);
        return ResponseEntity.ok("Person delelted");
    }
    
}


