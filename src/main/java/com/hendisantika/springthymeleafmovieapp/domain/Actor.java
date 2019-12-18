package com.hendisantika.springthymeleafmovieapp.domain;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-thymeleaf-movie-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/12/19
 * Time: 16.15
 */

@Entity
@NoArgsConstructor
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private String genre;

    public Actor(String firstName, String lastName, String genre) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGenre() {
        return genre;
    }
}