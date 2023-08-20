package com.registered.firstregistration.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



//The below four lines we've provided are related to Java Persistence API (JPA) and the use of Lombok annotations.

//Lombok Annotations (@Data, @AllArgsConstructor, @NoArgsConstructor):
// These annotations help reduce boilerplate code. Without these annotations,
// you would need to manually write getter and setter methods, constructors,
// and other repetitive code. Lombok generates this code for you, making your code more concise and readable.

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity   //This annotation is from JPA and is used to mark a class as a persistent entity,  In this case, the User class is being marked as a persistent entity, which means instances of this class will be stored in the corresponding database table.
@Table(name="userregister")  // In this case, the User class is being marked as a persistent entity, which means instances of this class will be stored in the corresponding database table.
public class User {

    private String name;
    @Id
    private String username;
    private String email;
    private String phone;
    private String password;
    private String cpassword;
    private String gender;


}
