package edu.iu.wkusper.flowerorder.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(schema = "flowers")
public class Customer {

    String username;
    String password;

    @Id
    String email;


    public Customer(String username,
                    String password,
                    String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Customer() {

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
