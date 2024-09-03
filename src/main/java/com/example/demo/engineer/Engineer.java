//package com.example.demo.engineer;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.time.LocalDateTime;
//
//@Getter
//@Setter
//@Entity
//public class Engineer {
//    @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column(nullable = false, length=50)
//    private String firstName;
//    @Column(nullable = false, length=50)
//    private String lastName;
//    @Column(nullable = false, length=30)
//    private String contactData;
//    private LocalDateTime createDate;
//
//    public Engineer(String firstName, String lastName, String contactData) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.contactData = contactData;
//        this.createDate = LocalDateTime.now();
//    }
//
//    public Engineer() {
//        this.createDate = LocalDateTime.now();
//    }
//}
