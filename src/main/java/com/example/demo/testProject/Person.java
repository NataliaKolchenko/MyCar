//package com.example.demo.testProject;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.data.repository.Repository;
//
//import java.util.Optional;
//
//
//@Getter
//@Setter
//@Entity
//public class Person {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String name;
//
//
//}
//
//
//
//interface PersonRepository  extends Repository<Person, Long> {
//    Person save(Person person);
//
//    Optional<Person> findById(long id);
//}
//
//
